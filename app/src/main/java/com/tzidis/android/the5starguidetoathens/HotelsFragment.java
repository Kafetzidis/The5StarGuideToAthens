package com.tzidis.android.the5starguidetoathens;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Enter numbers here

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place (getString(R.string.name_hot_grandebretagne), getString(R.string.
                address_hot_grandebretagne), getString(R.string.telephone_hot_grandebretagne) ,
                getString(R.string.description_hot_grandebretagne), R.drawable.grandebretagne,
                getString(R.string.url_hot_grandebretagne), getString(R.string.
                coordinates_hot_grandebretagne), getString(R.string.advice_hot_grandebretagne)));
        places.add(new Place (getString(R.string.name_hot_hilton), getString(R.string.
                address_hot_hilton), getString(R.string.telephone_hot_hilton) , getString(R.string.
                description_hot_hilton), R.drawable.hothilton, getString(R.string.url_hot_hilton),
                getString(R.string.coordinates_hot_hilton), getString(R.string.
                advice_hot_hilton)));
        places.add(new Place (getString(R.string.name_hot_astir), getString(R.string.
                address_hot_astir), getString(R.string.telephone_hot_astir) ,
                getString(R.string.description_hot_astir), R.drawable.hotastir,
                getString(R.string.url_hot_astir), getString(R.string.
                coordinates_hot_astir), getString(R.string.advice_hot_astir)));
        places.add(new Place (getString(R.string.name_hot_electrametropolis), getString(R.string.
                address_hot_electrametropolis), getString(R.string.telephone_hot_electrametropolis),
                getString(R.string.description_hot_electrametropolis), R.drawable.hotelectra,
                getString(R.string.url_hot_electrametropolis), getString(R.string.
                coordinates_hot_electrametropolis), getString(R.string.advice_hot_electrametropolis)));
        places.add(new Place (getString(R.string.name_hot_margi), getString(R.string.
                address_hot_margi), getString(R.string.telephone_hot_margi) , getString(R.string.
                description_hot_margi), R.drawable.hotmargi, getString(R.string.url_hot_margi),
                getString(R.string.coordinates_hot_margi), getString(R.string.advice_hot_margi)));
        places.add(new Place (getString(R.string.name_hot_new), getString(R.string.
                address_hot_new), getString(R.string.telephone_hot_new) ,
                getString(R.string.description_hot_new), R.drawable.hotnew,
                getString(R.string.url_hot_new), getString(R.string.
                coordinates_hot_new), getString(R.string.advice_hot_new)));
        places.add(new Place (getString(R.string.name_hot_inn), getString(R.string.
                address_hot_inn), getString(R.string.telephone_hot_inn) ,
                getString(R.string.description_hot_inn), R.drawable.hotinnathens,
                getString(R.string.url_hot_inn), getString(R.string.
                coordinates_hot_inn), getString(R.string.advice_hot_inn)));
        places.add(new Place (getString(R.string.name_hot_cocomat), getString(R.string.
                address_hot_cocomat), getString(R.string.telephone_hot_cocomat) ,
                getString(R.string.description_hot_cocomat), R.drawable.hotcocomat,
                getString(R.string.url_hot_cocomat), getString(R.string.
                coordinates_hot_cocomat), getString(R.string.advice_hot_cocomat)));
        places.add(new Place (getString(R.string.name_hot_periscope), getString(R.string.
                address_hot_periscope), getString(R.string.telephone_hot_periscope) ,
                getString(R.string.description_hot_periscope), R.drawable.hotperiscope,
                getString(R.string.url_hot_periscope), getString(R.string.
                coordinates_hot_periscope), getString(R.string.advice_hot_periscope)));
        places.add(new Place (getString(R.string.name_hot_360), getString(R.string.
                address_hot_360), getString(R.string.telephone_hot_360) ,
                getString(R.string.description_hot_360), R.drawable.hotthreesixty,
                getString(R.string.url_hot_360), getString(R.string.
                coordinates_hot_360), getString(R.string.advice_hot_360)));

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
        // ListView will display list items for each place in the list of places.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name itemsAdapter.

        listView.setAdapter(adapter);

        return rootView;
    }

}