package com.androidzeitgeist.viewpager;

import android.support.v4.app.Fragment;

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    private static final int COLORS[] = {
        0xFFFF0000, 0xFF00FF00, 0xFF0000FF,
        0xFFFF00FF, 0xFFFFFF00
    };

    public SampleFragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        ExampleFragment fragment = new ExampleFragment();

        fragment.setColor(COLORS[position]);
        fragment.setPosition(position);

        return fragment;
    }

    @Override
    public int getCount() {
        return COLORS.length;
    }
}

