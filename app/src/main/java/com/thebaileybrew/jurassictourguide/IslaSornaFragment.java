package com.thebaileybrew.jurassictourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class IslaSornaFragment extends Fragment {

    public static IslaSornaFragment newInstance() {
        IslaSornaFragment fragment = new IslaSornaFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jurassic_home, container, false);

        return rootView;
    }
}
