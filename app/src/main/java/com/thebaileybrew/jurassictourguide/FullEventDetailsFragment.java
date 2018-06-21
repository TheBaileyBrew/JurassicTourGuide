package com.thebaileybrew.jurassictourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FullEventDetailsFragment extends Fragment {

    private static final String EXTRA_CARD_MODEL = "EXTRA_CARD_MODEL";
    private static event eventModel;
    private ArrayList<event> Events = new ArrayList<>();
    private DinoCollectionArray eventList = new DinoCollectionArray();
    private ImageView eventImage;
    private TextView eventName;
    private TextView eventLocation;
    private TextView eventDetails;
    private TextView eventPeople;


    public static FullEventDetailsFragment newInstance(event eventModel) {
        FullEventDetailsFragment fragment = new FullEventDetailsFragment();
        Bundle args = new Bundle();
        args.putParcelable(EXTRA_CARD_MODEL, eventModel);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            eventModel = getArguments().getParcelable(EXTRA_CARD_MODEL);
        }
        if (savedInstanceState != null) {
            eventModel = savedInstanceState.getParcelable(EXTRA_CARD_MODEL);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_full_details, container, false);
        Events = eventList.getEvents();
        eventImage = view.findViewById(R.id.event_image);
        eventName = view.findViewById(R.id.event_name);
        eventDetails = view.findViewById(R.id.event_details);
        eventLocation = view.findViewById(R.id.event_location);
        eventPeople = view.findViewById(R.id.event_people);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        eventPeople.setText(eventModel.getEventPeople());
        eventName.setText(eventModel.getEventName());
        eventImage.setImageResource(eventModel.getEventImage());
        eventLocation.setText(eventModel.getEventLocation());
        eventDetails.setText(eventModel.getEventDetails());
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putParcelable(EXTRA_CARD_MODEL, eventModel);
        super.onSaveInstanceState(outState);
    }
}
