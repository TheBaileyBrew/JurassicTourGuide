package com.thebaileybrew.jurassictourguide;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationHolder> {
    private static  final String TAG = LocationAdapter.class.getSimpleName();
    private ArrayList<sublocations> locList;
    private Context context;
    private LayoutInflater mInflater;
    private CustomRecyclerListener recyclerListener;


    public LocationAdapter(Context context, ArrayList<sublocations> locList, CustomRecyclerListener recyclerListener) {
        this.mInflater = LayoutInflater.from(context);
        this.locList = locList;
        this.recyclerListener = recyclerListener;
    }

    @Override
    public LocationHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.location_list_item, parent, false);
        final LocationHolder lHolder = new LocationHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerListener.onItemClick(v, lHolder.getLayoutPosition());
            }
        });
        return lHolder;
    }

    @Override
    public void onBindViewHolder(LocationHolder holder, int position) {
        sublocations currentLoc = locList.get(position);
        holder.resourceIcon.setImageResource(currentLoc.getSublocationIcon());
    }

    @Override
    public int getItemCount() {
        return locList.size();
    }

    class LocationHolder extends RecyclerView.ViewHolder {

        public final ImageView resourceIcon;

        public LocationHolder(View itemView) {
            super(itemView);
            resourceIcon = itemView.findViewById(R.id.location_icon);
        }
    }
}
