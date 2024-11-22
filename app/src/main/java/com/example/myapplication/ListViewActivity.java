package com.example.myapplication;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView countryListView = findViewById(R.id.countryListView);
        ArrayList<String> countries = new ArrayList<>();
        CustomAdapter countryAdapter = new CustomAdapter(this, countries);
        countryListView.setAdapter(countryAdapter);


        ExpandableListView cityExpandableListView = findViewById(R.id.cityExpandableListView);
        HashMap<String, List<String>> countryCitiesMap = new HashMap<>();
        countryCitiesMap.put("Japan", List.of("Tokyo", "Kyoto", "Osaka"));
        countryCitiesMap.put("China", List.of("Beijing", "Shanghai", "Guangzhou"));
        countryCitiesMap.put("India", List.of("Delhi", "Mumbai", "Bangalore"));

        CustomExpandableAdapter expandableAdapter = new CustomExpandableAdapter(this, new ArrayList<>(countryCitiesMap.keySet()), countryCitiesMap);
        cityExpandableListView.setAdapter(expandableAdapter);
    }

}
