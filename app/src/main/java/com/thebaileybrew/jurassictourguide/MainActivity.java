package com.thebaileybrew.jurassictourguide;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // https://antonioleiva.com/navigation-view/
    // https://github.com/chrisbanes/cheesesquare/blob/master/app/src/main/java/com/support/android/designlibdemo/CheeseListFragment.java
    // https://github.com/antoniolg/MaterializeYourApp

    // Simplest explanation for including Tab Layout and ViewPager
    // https://android.jlelse.eu/tablayout-and-viewpager-in-your-android-app-738b8840c38a




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view pager that allows users to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        //Creates a simple Adapter that populates the correct fragment to be shown
        FragmentAdapter adapter = new FragmentAdapter(this, getSupportFragmentManager());


    }
}
