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
public class DinerFragment extends Fragment {


    public DinerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        //Create array list
        final ArrayList<Item> diners = new ArrayList<Item>();


        //Take data from strings.xml
        diners.add(new Item(getString(R.string.diner_title_1), getString(R.string.diner_content_1), R.drawable.diner_pic1));
        diners.add(new Item(getString(R.string.diner_title_2), getString(R.string.diner_content_2), R.drawable.diner_pic_2));
        diners.add(new Item(getString(R.string.diner_title_3), getString(R.string.diner_content_3), R.drawable.diner_pic_3));
        diners.add(new Item(getString(R.string.diner_title_4), getString(R.string.diner_content_4), R.drawable.diner_pic_4));
        diners.add(new Item(getString(R.string.diner_title_5), getString(R.string.diner_content_5), R.drawable.diner_pic_5));

        //Make the adapter for items
        ItemAdapter itemsAdapter = new ItemAdapter(getActivity(), diners);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Set list view 
        listView.setAdapter(itemsAdapter);

        return rootView;


    }

}
