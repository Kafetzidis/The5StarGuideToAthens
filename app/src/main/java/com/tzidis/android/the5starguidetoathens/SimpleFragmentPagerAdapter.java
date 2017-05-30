package com.tzidis.android.the5starguidetoathens;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{
    private final int PAGE_COUNT = 5;
    String tabTitles[];

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context c) {
        super(fm);
        Resources res = c.getResources();
        tabTitles = res.getStringArray(R.array.tabTitles);
    }



    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1){
            return new HotelsFragment();
        } else if (position == 2){
            return new DinningFragment();
        } else if (position == 3){
            return new ShoppingFragment();
        } else{
            return new KidsFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
