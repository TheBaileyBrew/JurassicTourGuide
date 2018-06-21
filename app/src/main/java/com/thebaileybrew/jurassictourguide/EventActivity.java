package com.thebaileybrew.jurassictourguide;

import android.animation.Animator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cleveroad.fanlayoutmanager.FanLayoutManager;
import com.cleveroad.fanlayoutmanager.FanLayoutManagerSettings;
import com.cleveroad.fanlayoutmanager.callbacks.FanChildDrawingOrderCallback;

import java.util.ArrayList;

public class EventActivity extends Fragment {

    private FanLayoutManager fanLayoutManager;
    private EventAdapter adapter;
    private ArrayList<event> Events = new ArrayList<>();

    public static EventActivity newInstance() {
        Bundle args = new Bundle();
        EventActivity fragment = new EventActivity();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.event_recycler, container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        DinoCollectionArray eventList = new DinoCollectionArray();
        Events = eventList.getEvents();

        final RecyclerView recyclerView = view.findViewById(R.id.event_recycler);

        FanLayoutManagerSettings fanLayoutManagerSettings = FanLayoutManagerSettings
                .newBuilder(getContext())
                .withFanRadius(true)
                .withAngleItemBounce(5)
                .withViewHeightDp(225)
                .withViewWidthDp(125)
                .build();

        fanLayoutManager = new FanLayoutManager(getContext(), fanLayoutManagerSettings);

        recyclerView.setLayoutManager(fanLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter = new EventAdapter(getContext(), Events);
        adapter.setOnItemClickListener(new EventAdapter.OnItemClickListener() {
            @Override
            public void onItemClicked(int position, final View view) {
                if(fanLayoutManager.getSelectedItemPosition() != position) {
                    fanLayoutManager.switchItem(recyclerView, position);
                } else {
                    fanLayoutManager.straightenSelectedItem(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animator animation) {
                            onClick(fanLayoutManager.getSelectedItemPosition());
                        }

                        @Override
                        public void onAnimationCancel(Animator animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animator animation) {

                        }
                    });
                }
            }
        });
        recyclerView.setAdapter(adapter);
        recyclerView.setChildDrawingOrderCallback(new FanChildDrawingOrderCallback(fanLayoutManager));
    }


    public void onClick(int position) {
        Toast.makeText(getContext(), "You've selected an item...", Toast.LENGTH_SHORT).show();
        FullEventDetailsFragment fragment = FullEventDetailsFragment.newInstance(adapter.getModelByPos(position));
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.root, fragment)
                .addToBackStack(null)
                .commit();
    }
    public boolean deselectIfSelected() {
        if (fanLayoutManager.isItemSelected()) {
            fanLayoutManager.deselectItem();
            return true;
        } else {
            return false;
        }
    }
}
