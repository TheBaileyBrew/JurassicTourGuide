package com.thebaileybrew.jurassictourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocationActivity extends AppCompatActivity {

    int screenWidth, screenHeight;
    TextView locationName, locationDetails;
    ImageView locationMap;
    RecyclerView mRecyclerView;
    ArrayList<sublocations> Locations = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_recycler);
        //Intent Calls

        DinoCollectionArray locList = new DinoCollectionArray();
        Locations = locList.getSublocationList();
        locationName = findViewById(R.id.location_name);
        locationDetails = findViewById(R.id.location_details);
        locationMap = findViewById(R.id.location_zoom);
        mRecyclerView = findViewById(R.id.location_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);




        LocationAdapter locationAdapter = new LocationAdapter(this, Locations, new CustomRecyclerListener() {
            @Override
            public void onItemClick(View v, int position) {
                sublocations currentSelection = Locations.get(position);
                String selectedName = currentSelection.getSublocation();
                String selectedDetails = currentSelection.getSublocationAppears();
                int selectedMap = currentSelection.getSublocationResource();
                locationName.setText(selectedName);
                locationDetails.setText(selectedDetails);
                locationMap.setImageResource(selectedMap);
            }
        });
        mRecyclerView.setAdapter(locationAdapter);
    }
}
