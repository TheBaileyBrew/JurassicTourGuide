package com.thebaileybrew.jurassictourguide;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.silencedut.expandablelayout.ExpandableLayout;

import java.util.ArrayList;
import java.util.HashSet;

public class DinosaursAdapter extends RecyclerView.Adapter<DinosaursAdapter.DinosaurHolder> {
    private LayoutInflater mInflater;
    private HashSet<Integer> mExpandedPositionSet = new HashSet<>();
    private ArrayList<dinosaur> Dinosaurs;

    public DinosaursAdapter(Context context, ArrayList<dinosaur> Dinosaurs) {
        this.mInflater = LayoutInflater.from(context);
        this.Dinosaurs = Dinosaurs;
    }

    @Override
    public DinosaurHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.dino_list_item,parent,false);
        return new DinosaurHolder(view);
    }

    @Override
    public void onBindViewHolder(DinosaurHolder holder, int position) {
        dinosaur currentDino = Dinosaurs.get(position);
        holder.updateItem(position);
        holder.setIsRecyclable(true);
        holder.dinoImage.setImageResource(currentDino.getDinosaurResource());
        holder.dinoTitle.setText(currentDino.getDinosaur());
        holder.dinoClass.setText(currentDino.getDinosaurClassification());
        holder.dinoThreat.setText(currentDino.getDinosaurDangerLevel());
        holder.dinoDetails.setText(currentDino.getDinosaurDetails());
        holder.dinoWeight.setText(R.string.weight);
        holder.dinoWeight.append("  ");
        holder.dinoWeight.append(currentDino.getDinoWeight());
        holder.dinoHeight.setText(R.string.length);
        holder.dinoHeight.append("  ");
        holder.dinoHeight.append(currentDino.getDinoHeight());
        holder.dinoDiscovered.setText(R.string.discovered);
        holder.dinoDiscovered.append("  ");
        holder.dinoDiscovered.append(currentDino.getDinoDiscovered());

        if(position %2 == 1) {
            //Expandable background -- colorAccentFade (Yellow)
            holder.cardExpander.setCardBackgroundColor(Color.parseColor("#35DBB001"));
            holder.dinoTitle.setTextColor(Color.parseColor("#DBB001"));
        } else {
            //Expandable background -- colorPrimaryFade (Red)
            holder.cardExpander.setCardBackgroundColor(Color.parseColor("#35BC0305"));
            holder.dinoTitle.setTextColor(Color.parseColor("#BC0305"));
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position%2;
    }

    @Override
    public int getItemCount() {
        return Dinosaurs.size();
    }

    class DinosaurHolder extends RecyclerView.ViewHolder {
        private ExpandableLayout expandableLayout;
        private CardView cardExpander;
        private ImageView dinoImage;
        private TextView dinoTitle;
        private TextView dinoClass;
        private TextView dinoThreat;
        private TextView dinoDetails;
        private TextView dinoHeight;
        private TextView dinoWeight;
        private TextView dinoDiscovered;
        private DinosaurHolder(final View itemView) {
            super(itemView);
            expandableLayout = itemView.findViewById(R.id.expandable_dino);
            dinoImage = itemView.findViewById(R.id.dino_image);
            dinoTitle = itemView.findViewById(R.id.dino_title);
            dinoClass = itemView.findViewById(R.id.dino_classification);
            dinoThreat = itemView.findViewById(R.id.dino_threatlevel);
            dinoDetails = itemView.findViewById(R.id.dino_details);
            cardExpander = itemView.findViewById(R.id.dino_card_expander);
            dinoHeight = itemView.findViewById(R.id.dino_quick_fact_one);
            dinoWeight = itemView.findViewById(R.id.dino_quick_fact_two);
            dinoDiscovered = itemView.findViewById(R.id.dino_quick_fact_three);
        }

        private void updateItem(final int position) {
            expandableLayout.setOnExpandListener(new ExpandableLayout.OnExpandListener() {
                @Override
                public void onExpand(boolean b) {
                    registerExpand(position);
                }
            });
            expandableLayout.setExpand(mExpandedPositionSet.contains(position));
        }
    }

    private void registerExpand(int position) {
        if (mExpandedPositionSet.contains(position)) {
            removeExpand(position);
        } else {
            addExpand(position);
        }
    }
    private void removeExpand(int position) {
        mExpandedPositionSet.remove(position);
    }
    private void addExpand(int position) {
        mExpandedPositionSet.add(position);
    }
}
