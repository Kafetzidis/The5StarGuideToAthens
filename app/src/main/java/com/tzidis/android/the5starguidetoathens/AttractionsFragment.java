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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Enter numbers here

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place (getString(R.string.name_attr_acropolis), getString(R.string.address_attr_acropolis),
                getString(R.string.telephone_attr_acropolis) , getString(R.string.description_attr_acropolis),
                R.drawable.acropolis, getString(R.string.url_attr_acropolis), getString(R.string.coordinates_attr_acropolis)
                , getString(R.string.advice_attr_acropolis)));
        places.add(new Place (getString(R.string.name_attr_plaka), getString(R.string.
                address_attr_plaka), getString(R.string.telephone_attr_plaka), getString(R.string.
                description_attr_plaka), R.drawable.attrplaka, getString(R.string.url_attr_plaka),
                getString(R.string.coordinates_attr_plaka), getString(R.string.advice_attr_plaka)));
        places.add(new Place (getString(R.string.name_attr_nam), getString(R.string.
                address_attr_nam), getString(R.string.telephone_attr_nam), getString(R.string.
                description_attr_nam), R.drawable.attrnationalmuseum, getString(R.string.
                url_attr_nam), getString(R.string.coordinates_attr_nam), getString(R.string.
                advice_attr_nam)));
        places.add(new Place (getString(R.string.name_attr_acropolismuseum), getString(R.string.
                address_attr_acropolismuseum), getString(R.string.telephone_attr_acropolismuseum),
                getString(R.string.description_attr_acropolismuseum), R.drawable.attracropolismuseum
                , getString(R.string.url_attr_acropolismuseum), getString(R.string.
                coordinates_attr_acropolismuseum), getString(R.string.advice_attr_acropolismuseum)));
        places.add(new Place (getString(R.string.name_attr_templeofolympianzeus), getString
                (R.string.address_attr_olympianzeus), getString(R.string.
                telephone_attr_olympianzeus), getString(R.string.
                description_attr_templeofolympianzeus), R.drawable.attrolympianzeus, getString(R.
                string.url_attr_olympianzeus), getString(R.string.coordinates_attr_olympianzeus),
                getString(R.string.advice_attr_olympianzeus)));
        places.add(new Place (getString(R.string.name_attr_lycabettus), getString(R.string.
                address_attr_lycabettus), getString(R.string.telephone_attr_lycabettus), getString
                (R.string.description_attr_lycabettus), R.drawable.attrlycabettus, getString(R.
                string.url_attr_lycabettus), getString(R.string.coordinates_attr_lycabettus),
                getString(R.string.advice_attr_lycabettus)));
        places.add(new Place (getString(R.string.name_attr_ancientagora),getString(R.string.
                address_attr_ancientagora), getString(R.string.telephone_attr_ancientagora),
                getString(R.string.description_attr_ancientagora), R.drawable.attrancientagora,
                getString(R.string.url_attr_ancientagora), getString(R.string.
                coordinates_attr_ancientagora), getString(R.string.advice_attr_ancientagora)));
        places.add(new Place (getString(R.string.name_attr_panathenaicstadium), getString(R.string.
                address_attr_panathenaicstadium), getString(R.string.
                telephone_attr_panathenaicstadium), getString(R.string.
                description_panathenaicstadium), R.drawable.attrpanathenaicstadium, getString(R.
                string.url_attr_panathenaicstadium), getString(R.string.
                coordinates_attr_panathenaicstadium), getString(R.string.
                advice_attr_panathenaicstadium)));
        places.add(new Place (getString(R.string.name_attr_unknownsoldier), getString(R.string.
                address_attr_unknownsoldier), getString(R.string.telephone_attr_unknownsoldier),
                getString(R.string.description_attr_tomboftheunknownsoldier), R.drawable.
                attrtombofunknownsoldier, getString(R.string.url_attr_unknownsoldier), getString
                (R.string.coordinates_attr_unknownsoldier), getString(R.string.
                advice_attr_unknownsoldier)));
        places.add(new Place (getString(R.string.name_attr_benaki), getString(R.string.
                address_attr_benaki), getString(R.string.telephone_attr_benaki), getString(R.string.
                description_attr_benaki), R.drawable.attrbenaki, getString(R.string.url_attr_benaki)
                , getString(R.string.coordinates_attr_benaki), getString(R.string.
                advice_attr_benaki)));
        places.add(new Place (getString(R.string.name_attr_cycladic), getString(R.string.
                address_attr_cycladic), getString(R.string.telephone_attr_cycladic), getString(R.
                string.description_attr_cycladicart), R.drawable.attrgoulandrismuseum, getString(R.
                string.url_attr_cycladic), getString(R.string.coordinates_attr_cycladic), getString
                (R.string.advice_attr_cycladic)));
        places.add(new Place (getString(R.string.name_attr_byzantine), getString(R.string.
                address_attr_byzantine), getString(R.string.telephone_attr_byzantine), getString
                (R.string.description_attr_byzantinemuseum), R.drawable.attrbyzantinemuseum,
                getString(R.string.url_attr_byzantine), getString(R.string.
                coordinates_attr_byzantine), getString(R.string.advice_attr_byzantine)));

        // Create an PlaceAdapter, whose data source is a list of Place objects. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource as defined.
        // This list item layout contains two TextViews, which the adapter will set to
        // display the name and address of the place.

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list.xml file.

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the ArrayAdapter we created above, so that the
        // ListView will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the ListView object and pass in
        // 1 argument, which is the ArrayAdapter with the variable name itemsAdapter.

        listView.setAdapter(adapter);

        return rootView;
    }

}
