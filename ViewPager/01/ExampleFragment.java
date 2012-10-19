package com.androidzeitgeist.viewpager;

import android.os.Bundle;

public class ExampleFragment extends Fragment {
    private int color;
    private int position;

    public void setColor(int color) {
        this.color = color;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView view = new TextView(container.getContext());

        view.setText(String.valueOf(position));
        view.setTextSize(32);
        view.setGravity(Gravity.CENTER);
        view.setBackgroundColor(color);

        return view;
    }
}

