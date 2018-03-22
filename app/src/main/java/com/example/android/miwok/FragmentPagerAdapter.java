package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Sara on 21/03/2018.
 */

public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter{

    Context mContext;
    String [] tabTitles;

    public FragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
        tabTitles = new String[] {mContext.getResources().getString(R.string.category_colors),
                mContext.getResources().getString(R.string.title_family),
                mContext.getResources().getString(R.string.category_numbers),
                mContext.getResources().getString(R.string.category_phrases) };

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ColorsFragment();

            case 1:
                return new FamilyFragment();

            case 2:

                return new NumbersFragment();

            default:
                return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
