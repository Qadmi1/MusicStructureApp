package com.example.a7mad.musicstructureapp_udacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PopMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_pop);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
