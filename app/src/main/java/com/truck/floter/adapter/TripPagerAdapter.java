package com.truck.floter.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TripPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList();
    private final List<String> mFragmentTitleList = new ArrayList();

    public TripPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    public Fragment getItem(int position) {
        return (Fragment) this.mFragmentList.get(position);
    }

    public int getCount() {
        return this.mFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        this.mFragmentList.add(fragment);
        this.mFragmentTitleList.add(title);
    }

    public CharSequence getPageTitle(int position) {
        return (CharSequence) this.mFragmentTitleList.get(position);
    }
}
