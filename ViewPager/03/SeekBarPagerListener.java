package com.androidzeitgeist.viewpager;

import android.support.v4.view.ViewPager;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/**
 * {@link OnSeekBarChangeListener} that delegates the current dragging state of the SeekBar to a ViewPager.
 */
public class SeekBarPagerListener implements OnSeekBarChangeListener {
    private ViewPager pager;
    private int maxOffset;
    private int currentOffset;

    public SeekBarPagerListener(ViewPager pager) {
        this.pager = pager;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (pager.isFakeDragging()) {
            int offset = (int) ((maxOffset / 100.0) * progress);
            int dragby = -1 * (offset - currentOffset);

            pager.fakeDragBy(dragby);

            currentOffset = offset;
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        maxOffset = pager.getWidth();

        pager.beginFakeDrag();
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        pager.endFakeDrag();

        currentOffset = 0;

        seekBar.setProgress(0);
    }
}
