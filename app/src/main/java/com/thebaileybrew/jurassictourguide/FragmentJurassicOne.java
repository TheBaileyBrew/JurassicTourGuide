package com.thebaileybrew.jurassictourguide;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentJurassicOne extends Fragment implements View.OnClickListener{

    public static FragmentJurassicOne newInstance() {
        FragmentJurassicOne fragment = new FragmentJurassicOne();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jurassic_one, container, false);

        CardView locations = rootView.findViewById(R.id.recycler_card_locations);
        CardView dinosaurs = rootView.findViewById(R.id.recycler_card_dinosaur);
        CardView people = rootView.findViewById(R.id.recycler_card_people);
        CardView events = rootView.findViewById(R.id.recycler_card_events);
        locations.setOnClickListener(this);
        dinosaurs.setOnClickListener(this);
        people.setOnClickListener(this);
        events.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {
        String movieSelection = "One";
        switch(v.getId()) {
            case R.id.recycler_card_locations:
                Intent openLocations = new Intent(v.getContext(),LocationActivity.class);
                openLocations.putExtra("FromMovie", movieSelection);
                v.getContext().startActivity(openLocations);
                break;
            case R.id.recycler_card_dinosaur:
                Intent openDinosaurs = new Intent(v.getContext(),DinosaurActivity.class);
                openDinosaurs.putExtra("FromMovie", movieSelection);
                v.getContext().startActivity(openDinosaurs);
                break;
            case R.id.recycler_card_people:
                Intent openPeople = new Intent(v.getContext(), PeopleActivity.class);
                openPeople.putExtra("FromMovie", movieSelection);
                v.getContext().startActivity(openPeople);
                break;
            case R.id.recycler_card_events:
                Intent openEvents = new Intent(v.getContext(),EventMainFragActivity.class);
                openEvents.putExtra("FromMovie", movieSelection);
                v.getContext().startActivity(openEvents);
                break;
        }
    }
}
