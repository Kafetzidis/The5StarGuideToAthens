package com.tzidis.android.the5starguidetoathens;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Tzidis on 21-May-17.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{
    private final int PAGE_COUNT = 5;
    private String tabTitles[] = new String[] { "Attractions", "Hotels", "Dinning", "Shopping", "Kids" };

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);    }

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
