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
public class NightLiveFragment extends Fragment {


    public NightLiveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        //Create array list
        final ArrayList<Item> nightLives = new ArrayList<Item>();


        //Take data from strings.xml
        nightLives.add(new Item(getString(R.string.night_title_1), getString(R.string.night_content_1), R.drawable.night_pic_1));
        nightLives.add(new Item(getString(R.string.night_title_2), getString(R.string.night_content_2), R.drawable.night_pic_2));
        nightLives.add(new Item(getString(R.string.night_title_3), getString(R.string.night_content_3), R.drawable.night_pic_3));
        nightLives.add(new Item(getString(R.string.night_title_4), getString(R.string.night_content_4), R.drawable.night_pic_4));
        nightLives.add(new Item(getString(R.string.night_title_5), getString(R.string.night_content_5), R.drawable.night_pic_5));

        //Make the adapter for items
        ItemAdapter itemsAdapter = new ItemAdapter(getActivity(), nightLives);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Set list view 
        listView.setAdapter(itemsAdapter);

        return rootView;


    }

}
