package com.thebaileybrew.jurassictourguide;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationRecyclerAdapter extends RecyclerView.Adapter<LocationRecyclerAdapter.ViewHolder> {

    private static String TAG = "Location Recycler";
    private ArrayList<location> Locations;

    private AdapterView.OnItemSelectedListener onSelect;

    public LocationRecyclerAdapter(ArrayList<location> Locations) {
        this.Locations = Locations;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.location_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder (ViewHolder holder, final int position) {
        location currentLocation = Locations.get(position);
        holder.setLocationBackground(currentLocation.getLocationHeaderImage());
        holder.setLocationText(currentLocation.getLocationHeader());
        holder.setDinoBackground(currentLocation.getLocationDinosaurImage());
        holder.setDinoText(currentLocation.getLocationDinosaurs());
        holder.setPeopleBackground(currentLocation.getLocationPeopleImage());
        holder.setPeopleText(currentLocation.getLocationPeople());
        holder.setEventBackground(currentLocation.getLocationEventsImage());
        holder.setEventText(currentLocation.getLocationEvents());
    }

    @Override
    public int getItemCount() {
        if (Locations == null) {
            return 0;
        } else {
            return Locations.size();
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout linearContainer;
        private TextView locationSectionHeader;
        private ImageView locationSectionBackground;
        private TextView dinoSectionHeader;
        private ImageView dinoSectionBackground;
        private TextView peopleSectionHeader;
        private ImageView peopleSectionBackground;
        private TextView eventSectionHeader;
        private ImageView eventSectionBackground;

        public ViewHolder(View itemView) {
            super(itemView);
            locationSectionHeader = itemView.findViewById(R.id.locations_section_text);
            dinoSectionHeader = itemView.findViewById(R.id.dino_section_text);
            peopleSectionHeader = itemView.findViewById(R.id.people_section_text);
            eventSectionHeader = itemView.findViewById(R.id.events_section_text);
            locationSectionBackground = itemView.findViewById(R.id.locations_section_background);
            dinoSectionBackground = itemView.findViewById(R.id.dino_section_background);
            peopleSectionBackground = itemView.findViewById(R.id.people_section_background);
            eventSectionBackground = itemView.findViewById(R.id.events_section_background);
        }

        public void setLocationBackground(int locationBackground) {
            locationSectionBackground.setImageResource(locationBackground);
        }
        public void setLocationText(String locationText) {
            locationSectionHeader.setText(locationText);
        }
        public void setDinoBackground(int dinoBackground) {
            dinoSectionBackground.setImageResource(dinoBackground);
        }
        public void setDinoText(String dinoText) {
            dinoSectionHeader.setText(dinoText);
        }
        public void setPeopleBackground(int peopleBackground) {
            peopleSectionBackground.setImageResource(peopleBackground);
        }
        public void setPeopleText(String peopleText) {
            peopleSectionHeader.setText(peopleText);
        }
        public void setEventBackground(int eventsBackground) {
            eventSectionBackground.setImageResource(eventsBackground);
        }
        public void setEventText(String eventsText) {
            eventSectionHeader.setText(eventsText);
        }
    }
}