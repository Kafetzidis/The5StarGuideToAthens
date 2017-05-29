package com.tzidis.android.the5starguidetoathens;

import android.content.Context;
import android.content.Intent;
import android.graphics.YuvImage;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class PlaceDetailsActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_detailed);

        //Get the properties of the Place Object from the intent
        Bundle b = getIntent().getExtras();
        final String placeName = b.getString("placeName");
        final String placeAddress = b.getString("placeAddress");
        final String placeTelephone = b.getString("placeTelephone");
        final String placeDescription = b.getString("placeDescription");
        int placeImage = b.getInt("placeImage");
        final String placeSite = b.getString("placeSite");
        final String placeLocation = b.getString("placeLocation");
        final String placeAdvice = b.getString("placeAdvice");

        //Initialize toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //Set custom title
        toolbar.setTitle(placeName);
        setSupportActionBar(toolbar);
        //Show "back" button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Set the image to the ImageView in the activity_place_details.xml
        ImageView imageView = (ImageView) findViewById(R.id.detailed_image);
        imageView.setImageResource(placeImage);

        //Set the address to the TextView in the activity_place_details.xml
        TextView addressTextView = (TextView) findViewById(R.id.detailed_address);
        addressTextView.setText(placeAddress);

        //Set the telephone to the TextView in the activity_place_details.xml
        TextView telephoneTextView = (TextView) findViewById(R.id.detailed_telephone);
        telephoneTextView.setText(placeTelephone);

        //Set the description to the TextView in the activity_place_details.xml
        TextView descriptionTextView = (TextView) findViewById(R.id.detailed_desc);
        descriptionTextView.setText(placeDescription);

        //Set the Loofie advice to the TextView in the activity_place_details.xml
        TextView adviceTextView = (TextView) findViewById(R.id.advice);
        adviceTextView.setText(placeAdvice);

        //Create an intent for the telephone of the Place Object
        ImageButton telephoneView = (ImageButton) findViewById(R.id.link_telephone);
        telephoneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //If clicking on the icon, goes to the site of the place
                Uri telephone = Uri.parse("tel:"+placeTelephone);
                Intent telephoneIntent = new Intent(Intent.ACTION_DIAL, telephone);
                if (telephoneIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(telephoneIntent);
                }
            }
        });

        //Create an intent for the web page of the Place Object
        ImageButton urlView = (ImageButton) findViewById(R.id.link_webpage);
        urlView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //If clicking on the icon, goes to the site of the place
                Uri webpage = Uri.parse("http:"+placeSite);
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                if (webIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webIntent);
                }
            }
        });

        //Create an intent for the map location of the Place Object
        ImageButton mapView = (ImageButton) findViewById(R.id.link_map);
        mapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //If clicking on the icon, goes to the site of the place
                Uri geoLocation = Uri.parse("geo:0,0?q="+placeLocation+"("+Uri.encode(placeName)+")");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoLocation);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

    }
}


