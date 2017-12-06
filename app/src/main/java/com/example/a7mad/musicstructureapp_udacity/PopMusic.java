package com.example.a7mad.musicstructureapp_udacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PopMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayList<SongDetail> songList= new ArrayList<>();
        songList.add(new SongDetail(R.string.thriller, R.string.micheal));
        songList.add(new SongDetail(R.string.billie, R.string.micheal));
        songList.add(new SongDetail(R.string.always, R.string.whitney));
        songList.add(new SongDetail(R.string.call, R.string.carly));
        songList.add(new SongDetail(R.string.purple, R.string.prince));
        songList.add(new SongDetail(R.string.tonight, R.string.enrique));
        songList.add(new SongDetail(R.string.everything, R.string.pitbull));
        songList.add(new SongDetail(R.string.bad, R.string.micheal));
        songList.add(new SongDetail(R.string.gangham, R.string.psy));
        songList.add(new SongDetail(R.string.uptown, R.string.ronson));


        // Create an object from our custom adapter
        SongAdapter songAdapter = new SongAdapter(this, songList);
        // Create a reference to the ListView
        ListView listView = findViewById(R.id.list_song);
        listView.setAdapter(songAdapter);
    }
}
