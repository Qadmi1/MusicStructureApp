package com.example.a7mad.musicstructureapp_udacity;

/**
 * Created by a7mad on 03/12/17.
 */

public class SongDetail {
    private int songName;
    private int artistName;

    public SongDetail(int songName, int artistName) {
        this.songName = songName;
        this.artistName = artistName;
    }

    public int getSongName() {
        return songName;
    }

    public int getArtistName() {
        return artistName;
    }
}
