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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Enter numbers here

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place (getString(R.string.name_sho_attica), getString(R.string.address_sho_attica),
                getString(R.string.telephone_sho_attica) , getString(R.string.description_sho_attica),
                R.drawable.shoattica, getString(R.string.url_sho_attica), getString(R.string.coordinates_sho_attica),
                getString(R.string.advice_sho_attica)));
        places.add(new Place (getString(R.string.name_sho_ermou), getString(R.string.address_sho_ermou),
                getString(R.string.telephone_sho_ermou) , getString(R.string.description_sho_ermou),
                R.drawable.shoermou, getString(R.string.url_sho_ermou), getString(R.string.coordinates_sho_ermou),
                getString(R.string.advice_sho_ermou)));
        places.add(new Place (getString(R.string.name_sho_id), getString(R.string.address_sho_id),
                getString(R.string.telephone_sho_id) , getString(R.string.description_sho_id),
                R.drawable.id, getString(R.string.url_sho_id), getString(R.string.coordinates_sho_id),
                getString(R.string.advice_sho_id)));
        places.add(new Place (getString(R.string.name_sho_ileanamakri), getString(R.string.address_sho_ileanamakri),
                getString(R.string.telephone_sho_ileanamakri) , getString(R.string.description_sho_ileanamakri),
                R.drawable.shoileannamakri, getString(R.string.url_sho_ileanamakri), getString(R.string.coordinates_sho_ileanamakri),
                getString(R.string.advice_sho_ileanamakri)));
        places.add(new Place (getString(R.string.name_sho_monastiraki), getString(R.string.address_sho_monastiraki),
                getString(R.string.telephone_sho_monastiraki) , getString(R.string.description_sho_monastiraki),
                R.drawable.shomonastiraki, getString(R.string.url_sho_monastiraki), getString(R.string.coordinates_sho_monastiraki),
                getString(R.string.advice_sho_monastiraki)));
        places.add(new Place (getString(R.string.name_sho_apivita), getString(R.string.address_sho_apivita),
                getString(R.string.telephone_sho_apivita) , getString(R.string.description_sho_apivita),
                R.drawable.shoapivita, getString(R.string.url_sho_apivita), getString(R.string.coordinates_sho_apivita),
                getString(R.string.advice_sho_apivita)));
        places.add(new Place (getString(R.string.name_sho_goldenhall), getString(R.string.address_sho_goldenhall),
                getString(R.string.telephone_sho_goldenhall) , getString(R.string.description_sho_goldenhall),
                R.drawable.shogoldenhall, getString(R.string.url_sho_goldenhall), getString(R.string.coordinates_sho_goldenhall),
                getString(R.string.advice_sho_goldenhall)));
        places.add(new Place (getString(R.string.name_sho_thalassa), getString(R.string.address_sho_thalassa),
                getString(R.string.telephone_sho_thalassa) , getString(R.string.description_sho_thalassa),
                R.drawable.shothalassa, getString(R.string.url_sho_thalassa), getString(R.string.coordinates_sho_thalassa),
                getString(R.string.advice_sho_thalassa)));

        // Create an PlaceAdapter, whose data source is a list of Place objects. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource as defined.
        // This list item layout contains two TextViews, which the adapter will set to
        // display the name and address of the place.

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // places_list.xml file.

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of places.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name adapter.

        listView.setAdapter(adapter);

        return rootView;
    }

}
