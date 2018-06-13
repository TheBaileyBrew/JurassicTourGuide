package com.thebaileybrew.jurassictourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

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
                return new IslaNublarFragment();
            case 1: //Return Fragment -- Remove Break;
                return new IslaSornaFragment();
            case 2:
                return new SanDiegoFragment();
            case 3:
                return new OtherImportantLocationFragment();
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
        //Generated the title based on position returned
        switch(position) {
            case 0:
                return mContext.getString(R.string.isla_nublar);
            case 1:
                return mContext.getString(R.string.isla_sorna);
            case 2:
                return mContext.getString(R.string.san_diego);
            case 3:
                return mContext.getString(R.string.other_important);
            default:
                return null;
        }
    }
}
