package com.digitalspaceguru.simpleandroidtestapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import android.widget.TextView;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest  {

    private MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }

    @Test
    public void validateTextView()  {
        TextView textView = activity.findViewById(R.id.textView);
        assertEquals("Maleek", textView.getText().toString());
    }
}
