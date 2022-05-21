package com.digitalspaceguru.simpleandroidtestapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AlphabetAdapter extends BaseAdapter {
    private Context mContext;
    private String[] mLetters;

    public AlphabetAdapter(Context mContext, String[] Letters) {
        this.mContext = mContext;
        this.mLetters = Letters;
    }

    @Override
    public int getCount() {
        return mLetters.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;

        if(view == null){
            gridView = inflater.inflate(R.layout.alphabet_grid_item, null);
            TextView letterView = (TextView) gridView
                    .findViewById(R.id.grid_item_letter);
            letterView.setText("A");  // using dummy data for now
        } else {
            gridView = (View) view;
        }
        return gridView;
    }
}
