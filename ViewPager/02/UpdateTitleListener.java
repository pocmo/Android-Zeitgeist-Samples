package com.androidzeitgeist.viewpager;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;

public class UpdateTitleListener extends SimpleOnPageChangeListener {
    private Activity activity;
    private PagerAdapter adapter;

    public UpdateTitleListener(Activity activity, PagerAdapter adapter) {
        this.activity = activity;
        this.adapter  = adapter;
    }

    @Override
    public void onPageSelected(int position) {
        activity.setTitle(adapter.getPageTitle(position));
    }
}
