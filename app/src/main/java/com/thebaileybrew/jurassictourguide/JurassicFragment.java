package com.thebaileybrew.jurassictourguide;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class JurassicFragment extends Fragment {

    public static JurassicFragment newInstance() {
        JurassicFragment fragment = new JurassicFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jurassic_home, container, false);

        return rootView;
    }
}
