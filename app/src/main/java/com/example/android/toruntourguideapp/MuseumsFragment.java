package com.example.android.toruntourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        //Create arraylist
        final ArrayList<Item> museums = new ArrayList<Item>();


        //Take data from strings.xml
        museums.add(new Item(getString(R.string.museum_title_1), getString(R.string.museum_content_1), R.drawable.museum_pic_1));
        museums.add(new Item(getString(R.string.museum_title_2), getString(R.string.museum_content_2), R.drawable.museum_pic_2));
        museums.add(new Item(getString(R.string.museum_title_3), getString(R.string.museum_content_3), R.drawable.museum_pic_3));
        museums.add(new Item(getString(R.string.museum_title_4), getString(R.string.museum_content_4), R.drawable.museum_pic_4));
        museums.add(new Item(getString(R.string.museum_title_5), getString(R.string.museum_content_5), R.drawable.museum_pic_5));

        //Make the adapter for items
        ItemAdapter itemsAdapter = new ItemAdapter(getActivity(), museums);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Set list view
        listView.setAdapter(itemsAdapter);

        return rootView;


    }

}
