package com.thebaileybrew.jurassictourguide;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jackandphantom.circularimageview.CircleImage;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleHolder> {
    private LayoutInflater mInflater;
    private ArrayList<people> People;
    private CustomRecyclerListener recyclerListener;

    public PeopleAdapter(Context context, ArrayList<people> People, CustomRecyclerListener recyclerListener) {
        this.mInflater = LayoutInflater.from(context);
        this.People = People;
        this.recyclerListener = recyclerListener;
    }

    @Override
    public PeopleHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.people_list_item, parent, false);
        final PeopleHolder pHolder = new PeopleHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerListener.onItemClick(v, pHolder.getLayoutPosition());
            }
        });
        return pHolder;
    }

    @Override
    public void onBindViewHolder(PeopleHolder holder, int position) {
        people currentPerson = People.get(position);
        holder.peopleImage.setImageResource(currentPerson.getPeopleResource());
    }

    @Override
    public int getItemCount() {
        return People.size();
    }

    class PeopleHolder extends RecyclerView.ViewHolder {
        private CircleImage peopleImage;

        private PeopleHolder(final View peopleView) {
            super(peopleView);
            peopleImage = peopleView.findViewById(R.id.people_image);
        }
    }

}
