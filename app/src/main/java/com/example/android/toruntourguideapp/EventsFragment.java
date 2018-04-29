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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        //Create array list 
        final ArrayList<Item> events = new ArrayList<Item>();


        //Take data from strings.xml
        events.add(new Item(getString(R.string.event_title_1), getString(R.string.event_content_1), R.drawable.event_pic_1));
        events.add(new Item(getString(R.string.event_title_2), getString(R.string.event_content_2), R.drawable.event_pic_2));
        events.add(new Item(getString(R.string.event_title_3), getString(R.string.event_content_3), R.drawable.event_pic_3));
        events.add(new Item(getString(R.string.event_title_4), getString(R.string.event_content_4), R.drawable.event_pic_4));


        //Make the adapter for items
        ItemAdapter itemsAdapter = new ItemAdapter(getActivity(), events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Set list view 
        listView.setAdapter(itemsAdapter);

        return rootView;


    }

}
