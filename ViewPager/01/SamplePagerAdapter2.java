package com.androidzeitgeist.viewpager;

import com.androidzeitgeist.adapter.ViewPagerAdapter;

public class SamplePagerAdapter2 extends ViewPagerAdapter {
    private static final int COLORS[] = {
        0xFFFF0000, 0xFF00FF00, 0xFF0000FF, 0xFFFF00FF, 0xFFFFFF00
    };

    @Override
    public View getView(int position, ViewPager pager) {
        TextView view = new TextView(pager.getContext());

        view.setText(String.valueOf(position));
        view.setTextSize(32);
        view.setGravity(Gravity.CENTER);
        view.setBackgroundColor(COLORS[position]);

        return view;
    }

    @Override
    public int getCount() {
        return COLORS.length;
    }
}

