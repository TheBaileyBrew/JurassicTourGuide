package com.thebaileybrew.jurassictourguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {

    private ArrayList<event> Events = new ArrayList<>();
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;

    EventAdapter(Context context, ArrayList<event> Events) {
        this.Events = Events;
        this.mContext = context;
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list_item, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final EventViewHolder holder, int position) {
        event eventItem = Events.get(position);
        //holder details
        holder.eventName.setText(eventItem.getEventName());
        holder.eventLocation.setText(eventItem.getEventLocation());
        holder.eventImage.setImageResource(eventItem.getEventImage());
        holder.eventFilm.setText(eventItem.getEventFilm());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClicked(holder.getAdapterPosition(), holder.eventImage);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return Events.size();
    }

    public OnItemClickListener getOnItemClickListener() {
        return mOnItemClickListener;
    }

    void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    event getModelByPos(int pos) {
        return Events.get(pos);

    }

    interface OnItemClickListener {
        void onItemClicked(int position, View view);
    }

    class EventViewHolder extends RecyclerView.ViewHolder {
        final TextView eventName;
        final TextView eventLocation;
        final ImageView eventImage;
        final TextView eventFilm;

        EventViewHolder(View itemView) {
            super(itemView);
            eventName = itemView.findViewById(R.id.event_name);
            eventLocation = itemView.findViewById(R.id.event_location);
            eventImage = itemView.findViewById(R.id.event_image);
            eventFilm = itemView.findViewById(R.id.event_people);
        }
    }


}
