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
public class DinningFragment extends Fragment {


    public DinningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Enter numbers here

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place (getString(R.string.name_din_cookoovaya), getString(R.string.
                address_din_cookoovaya), getString(R.string.telephone_din_cookoovaya) , getString
                (R.string.description_din_cookoovaya), R.drawable.cookoovaya, getString(R.string.
                url_din_cookoovaya), getString(R.string.coordinates_din_cookoovaya), getString
                (R.string.advice_din_cookoovaya)));
        places.add(new Place (getString(R.string.name_din_spondi), getString(R.string.
                address_din_spondi), getString(R.string.telephone_din_spondi) , getString
                (R.string.description_din_spondi), R.drawable.dinspondi, getString(R.string.
                url_din_spondi), getString(R.string.coordinates_din_spondi), getString
                (R.string.advice_din_spondi)));
        places.add(new Place (getString(R.string.name_din_varoulko), getString(R.string.
                address_din_varoulko), getString(R.string.telephone_din_varoulko) , getString
                (R.string.description_din_varoulko), R.drawable.dinvaroulko, getString(R.string.
                url_din_varoulko), getString(R.string.coordinates_din_varoulko), getString
                (R.string.advice_din_varoulko)));
        places.add(new Place (getString(R.string.name_din_dionysos), getString(R.string.
                address_din_dionysos), getString(R.string.telephone_din_dionysos) , getString
                (R.string.description_din_dionysos), R.drawable.dindionysos, getString(R.string.
                url_din_dionysos), getString(R.string.coordinates_din_dionysos), getString
                (R.string.advice_din_dionysos)));
        places.add(new Place (getString(R.string.name_din_zonars), getString(R.string.
                address_din_zonars), getString(R.string.telephone_din_zonars) , getString
                (R.string.description_din_zonars), R.drawable.dinzonars, getString(R.string.
                url_din_zonars), getString(R.string.coordinates_din_zonars), getString
                (R.string.advice_din_zonars)));
        places.add(new Place (getString(R.string.name_din_matsuhisa), getString(R.string.
                address_din_matsuhisa), getString(R.string.telephone_din_matsuhisa) , getString
                (R.string.description_din_matsuhisa), R.drawable.dinmatsuhisa, getString(R.string.
                url_din_matsuhisa), getString(R.string.coordinates_din_matsuhisa), getString
                (R.string.advice_din_matsuhisa)));
        places.add(new Place (getString(R.string.name_din_kuzina), getString(R.string.
                address_din_kuzina), getString(R.string.telephone_din_kuzina) , getString
                (R.string.description_din_kuzina), R.drawable.dinkuzina, getString(R.string.
                url_din_kuzina), getString(R.string.coordinates_din_kuzina), getString
                (R.string.advice_din_kuzina)));
        places.add(new Place (getString(R.string.name_din_yolenis), getString(R.string.
                address_din_yolenis), getString(R.string.telephone_din_yolenis) , getString
                (R.string.description_din_yolenis), R.drawable.dinyolenis, getString(R.string.
                url_din_yolenis), getString(R.string.coordinates_din_yolenis), getString
                (R.string.advice_din_yolenis)));
        places.add(new Place (getString(R.string.name_din_basegrill), getString(R.string.
                address_din_basegrill), getString(R.string.telephone_din_basegrill) , getString
                (R.string.description_din_basegrill), R.drawable.dinbasegrill, getString(R.string.
                url_din_basegrill), getString(R.string.coordinates_din_basegrill), getString
                (R.string.advice_din_basegrill)));
        places.add(new Place (getString(R.string.name_din_parkoeleftherias), getString(R.string.
                address_din_parkoeleftherias), getString(R.string.telephone_din_parkoeleftherias) , getString
                (R.string.description_din_parkoeleftherias), R.drawable.dinparkoeleftherias, getString(R.string.
                url_din_parkoeleftherias), getString(R.string.coordinates_din_parkoeleftherias), getString
                (R.string.advice_din_parkoeleftherias)));

        // Create an PlaceAdapter, whose data source is a list of Place objects. The
        // adapter knows how to create layouts for each item in the list, using the
        // list_item.xml layout resource as defined.
        // This list item layout contains two TextViews, which the adapter will set to
        // display the name and the address of the place

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
