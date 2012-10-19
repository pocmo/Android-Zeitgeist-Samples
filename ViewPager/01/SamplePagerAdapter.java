ckage com.androidzeitgeist.viewpager;

import android.support.v4.view.PagerAdapter;

public class SamplePagerAdapter extends PagerAdapter {
    private static final int COLORS[] = {
        0xFFFF0000, 0xFF00FF00, 0xFF0000FF, 0xFFFF00FF, 0xFFFFFF00
    };

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ViewPager pager = (ViewPager) container;

        TextView view = new TextView(pager.getContext());
        view.setText(String.valueOf(position));
        view.setTextSize(32);
        view.setGravity(Gravity.CENTER);
        view.setBackgroundColor(COLORS[position]);

        pager.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object view) {
        ((ViewPager) container).removeView((View) view);
    }

    @Override
    public int getCount() {
        return COLORS.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}

