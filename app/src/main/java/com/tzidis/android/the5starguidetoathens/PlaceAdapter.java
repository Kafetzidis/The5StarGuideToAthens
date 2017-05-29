package com.tzidis.android.the5starguidetoathens;

/*
* PlaceAdapter is an ArrayAdapter that can provide the layout for each list
* based on a data source, which is a list of Places objects.
* */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Set;

import static android.R.attr.description;
import static android.R.attr.id;
import static android.R.attr.name;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private Context context = getContext();

    public PlaceAdapter(Activity context, ArrayList<Place> places) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Place object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID Name_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.Name_text_view);

        // Get the adress from the current Place object and
        // set this text on the address TextView
        nameTextView.setText(currentPlace.getName());

        // Find the TextView in the list_item.xml layout with the ID Address_text_view
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.Address_text_view);

        // Get the address from the current Place object and
        // set this text on the addressTextView
        addressTextView.setText(currentPlace.getAddress());

        // Find the ImageView in the list_item.xml layout with the ID version_number
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        //Display the provided image based on the resource ID
        imageView.setImageResource(currentPlace.getImageResourceID());


        //Create an implicit intent to display the detailed place information if the user taps on the list item
        final Intent itemIntent = new Intent(context, PlaceDetailsActivity.class);

        //Put the properties of the Object to the intent
        itemIntent.putExtra("placeName", currentPlace.getName());
        itemIntent.putExtra("placeAdd-ress", currentPlace.getAddress());
        itemIntent.putExtra("placeTelephone", currentPlace.getTelephone());
        itemIntent.putExtra("placeDescription", currentPlace.getDescription());
        itemIntent.putExtra("placeImage", currentPlace.getImageResourceID());
        itemIntent.putExtra("placeSite", currentPlace.getURL());
        itemIntent.putExtra("placeLocation", currentPlace.getCoordinates());
        itemIntent.putExtra("placeAdvice" , currentPlace.getAdvice());


        //Start the intent if the user taps on the list item
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });


        // Return the whole list item layout (containing 2 TextViews and 1 ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
