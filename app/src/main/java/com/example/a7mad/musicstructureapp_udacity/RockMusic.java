package com.example.a7mad.musicstructureapp_udacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RockMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayList<SongDetail> songList= new ArrayList<>();
        songList.add(new SongDetail(R.string.heaven, R.string.led));
        songList.add(new SongDetail(R.string.bohemian, R.string.queen));
        songList.add(new SongDetail(R.string.hotel, R.string.eagles));
        songList.add(new SongDetail(R.string.bird, R.string.skynard));
        songList.add(new SongDetail(R.string.baba, R.string.who));
        songList.add(new SongDetail(R.string.numb, R.string.floyd));
        songList.add(new SongDetail(R.string.carry, R.string.kansas));
        songList.add(new SongDetail(R.string.paint, R.string.stones));
        songList.add(new SongDetail(R.string.day, R.string.beatles));
        songList.add(new SongDetail(R.string.lightning, R.string.beatles));


        // Create an object from our custom adapter
        SongAdapter songAdapter = new SongAdapter(this, songList);
        // Create a reference to the ListView
        ListView listView = findViewById(R.id.list_song);
        listView.setAdapter(songAdapter);

    }
}
