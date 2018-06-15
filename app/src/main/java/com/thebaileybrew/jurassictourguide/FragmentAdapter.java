package com.thebaileybrew.jurassictourguide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: //Return Fragment -- Remove Break;
                return new FragmentJurassicOne();
            case 1: //Return Fragment -- Remove Break;
                return new FragmentJurassicTwo();
            case 2:
                return new FragmentJurassicThree();
            case 3:
                return new FragmentJurassicWorld();
        }
        return null; //Remove NULL return
    }

    @Override
    public int getCount() {
        //Returns the number of current pages
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return mContext.getString(R.string.jurassic_park_one);
            case 1:
                return mContext.getString(R.string.jurassic_park_two);
            case 2:
                return mContext.getString(R.string.jurassic_park_three);
            case 3:
                return mContext.getString(R.string.jurassic_world);
            default:
                return null;
        }
    }
}
