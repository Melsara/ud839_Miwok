package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.android.miwok.ColorsFragment;
import com.example.android.miwok.FamilyFragment;
import com.example.android.miwok.NumbersFragment;
import com.example.android.miwok.PhrasesFragment;

/**
 * Created by Sara on 21/03/2018.
 */

public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter{

    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
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

}
