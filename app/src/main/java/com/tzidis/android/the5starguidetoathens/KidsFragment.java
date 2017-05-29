package com.tzidis.android.the5starguidetoathens;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class KidsFragment extends Fragment {


    public KidsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Enter numbers here

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place (getString(R.string.name_kid_snfcc), getString(R.string.address_kid_snfcc),
                getString(R.string.telephone_kid_snfcc) , getString(R.string.description_kid_snfcc),
                R.drawable.snfcc, getString(R.string.url_kid_snfcc), getString
                (R.string.coordinates_kid_snfcc), getString(R.string.advice_kid_snfcc)));
        places.add(new Place (getString(R.string.name_kid_nationalgarden), getString(R.string.address_kid_nationalgarden),
                getString(R.string.telephone_kid_nationalgarden) , getString(R.string.description_kid_nationalgarden),
                R.drawable.kidnationalgarden, getString(R.string.url_kid_nationalgarden), getString
                (R.string.coordinates_kid_nationalgarden), getString(R.string.advice_kid_nationalgarden)));
        places.add(new Place (getString(R.string.name_kid_atticazoo), getString(R.string.address_kid_atticazoo),
                getString(R.string.telephone_kid_atticazoo) , getString(R.string.description_kid_atticazoo),
                R.drawable.kidatticazoo, getString(R.string.url_kid_atticazoo), getString
                (R.string.coordinates_kid_atticazoo), getString(R.string.advice_kid_atticazoo)));
        places.add(new Place (getString(R.string.name_kid_alloufunpark), getString(R.string.address_kid_alloufunpark),
                getString(R.string.telephone_kid_alloufunpark) , getString(R.string.description_kid_alloufunpark),
                R.drawable.kidalloufunpark, getString(R.string.url_kid_alloufunpark), getString
                (R.string.coordinates_kid_alloufunpark), getString(R.string.advice_kid_alloufunpark)));
        places.add(new Place (getString(R.string.name_kid_pnyka), getString(R.string.address_kid_pnyka),
                getString(R.string.telephone_kid_pnyka) , getString(R.string.description_kid_pnyka),
                R.drawable.kidpnyka, getString(R.string.url_kid_pnyka), getString
                (R.string.coordinates_kid_pnyka), getString(R.string.advice_kid_pnyka)));
        places.add(new Place (getString(R.string.name_kid_childrensmuseum), getString(R.string.address_kid_childrensmuseum),
                getString(R.string.telephone_kid_childrensmuseum) , getString(R.string.description_kid_childrensmuseum),
                R.drawable.kidchildrenmuseum, getString(R.string.url_kid_childrensmuseum), getString
                (R.string.coordinates_kid_childrensmuseum), getString(R.string.advice_kid_childrensmuseum)));
        places.add(new Place (getString(R.string.name_kid_goulandri), getString(R.string.address_kid_goulandri),
                getString(R.string.telephone_kid_goulandri) , getString(R.string.description_kid_goulandri),
                R.drawable.kidgoulandris, getString(R.string.url_kid_goulandri), getString
                (R.string.coordinates_kid_goulandri), getString(R.string.advice_kid_goulandri)));
        places.add(new Place (getString(R.string.name_kid_planetarium), getString(R.string.address_kid_planetarium),
                getString(R.string.telephone_kid_planetarium) , getString(R.string.description_kid_planetarium),
                R.drawable.kidplanetarium, getString(R.string.url_kid_planetarium), getString
                (R.string.coordinates_kid_planetarium), getString(R.string.advice_kid_planetarium)));

        // Create an PlaceAdapter, whose data source is a list of Place objects. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource as defined.
        // This list item layout contains two TextViews, which the adapter will set to
        // display the name and the address of the Place.

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // places_list.xml file.

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name adapter.

        listView.setAdapter(adapter);

        return rootView;
    }

}
