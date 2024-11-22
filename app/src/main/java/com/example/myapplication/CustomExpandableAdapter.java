package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class CustomExpandableAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> countries;
    private HashMap<String, List<String>> countryCitiesMap;

    public CustomExpandableAdapter(Context context, List<String> countries, HashMap<String, List<String>> countryCitiesMap) {
        this.context = context;
        this.countries = countries;
        this.countryCitiesMap = countryCitiesMap;
    }

    @Override
    public int getGroupCount() {
        return countries.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return countryCitiesMap.get(countries.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return countries.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return countryCitiesMap.get(countries.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.expandable_list_item, parent, false);
        }

        TextView headerTextView = convertView.findViewById(R.id.expandableHeaderTextView);
        headerTextView.setText((String) getGroup(groupPosition));

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.expandable_list_child_item, parent, false);
        }

        TextView childTextView = convertView.findViewById(R.id.childItemTextView);
        childTextView.setText((String) getChild(groupPosition, childPosition));

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}