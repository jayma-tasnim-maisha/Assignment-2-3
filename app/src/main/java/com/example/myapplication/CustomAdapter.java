package com.example.myapplication;

import android.os.Bundle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, List<String> countries) {
        super(context, 0, countries);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_country, parent, false);
        }

        String country = getItem(position);
        TextView countryNameTextView = convertView.findViewById(R.id.countryNameTextView);
        countryNameTextView.setText(country);

        return convertView;
    }
}