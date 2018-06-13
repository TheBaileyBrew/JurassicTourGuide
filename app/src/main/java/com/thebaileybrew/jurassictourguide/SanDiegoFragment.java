package com.thebaileybrew.jurassictourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SanDiegoFragment extends Fragment {

    public static SanDiegoFragment newInstance() {
        SanDiegoFragment fragment = new SanDiegoFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jurassic_home, container, false);

        return rootView;
    }
}
