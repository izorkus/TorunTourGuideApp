package com.example.android.toruntourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item>{

    public ItemAdapter(Activity context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        //Get te object position
        Item currentItem = getItem(position);

        //Find and infile item Title TextView
        TextView itemTitleView = (TextView) listItemView.findViewById(R.id.title_text_view);
        itemTitleView.setText(currentItem.getItemTitle());

        //find and infile item Content TextView
        TextView itemContentView = (TextView) listItemView.findViewById(R.id.content_text_view);
        itemContentView.setText(currentItem.getItemContent());

        //Check for image and if exist put in the ImageView
        ImageView itemPicture = (ImageView) listItemView.findViewById(R.id.image);

        if (currentItem.hasImage()) {
            itemPicture.setImageResource(currentItem.getImageResId());
            itemPicture.setVisibility(View.VISIBLE);
        } else {
            itemPicture.setVisibility(View.GONE);
        }

        //Return list item with proper date to the ListView
        return listItemView;
    }
}
