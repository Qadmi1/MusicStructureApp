package com.example.a7mad.musicstructureapp_udacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BluesMusic extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<SongDetail> songList= new ArrayList<>();
        songList.add(new SongDetail(R.string.hootchie, R.string.muddy));
        songList.add(new SongDetail(R.string.thrill, R.string.king));
        songList.add(new SongDetail(R.string.devil, R.string.robert));
        songList.add(new SongDetail(R.string.stone, R.string.buddy));
        songList.add(new SongDetail(R.string.blind, R.string.elta));
        songList.add(new SongDetail(R.string.tore, R.string.freddie));
        songList.add(new SongDetail(R.string.stormy, R.string.walker));
        songList.add(new SongDetail(R.string.boogie, R.string.john));
        songList.add(new SongDetail(R.string.house, R.string.hendrix));
        songList.add(new SongDetail(R.string.lightning, R.string.wolf));


        // Create an object from our custom adapter
        SongAdapter songAdapter = new SongAdapter(this, songList);
        // Create a reference to the ListView
        ListView listView = findViewById(R.id.list_song);
        listView.setAdapter(songAdapter);
    }
}
