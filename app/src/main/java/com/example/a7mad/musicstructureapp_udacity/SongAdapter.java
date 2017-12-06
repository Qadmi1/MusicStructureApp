package com.example.a7mad.musicstructureapp_udacity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by a7mad on 03/12/17.
 */

public class SongAdapter extends ArrayAdapter<SongDetail> {

    public SongAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Create a reference to the current SongDetail object.
        SongDetail currentSong = getItem(position);
        // If this is the first time using this layout, then inflate the layout.
        View listItem = convertView;
        if (listItem == null)
        {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.song_item, parent,
                    false);
        }
        // Create a reference to the song_name TextView, and assign the current song to it.
        TextView songName = listItem.findViewById(R.id.song_name);
        songName.setText(currentSong.getSongName());
        // Create a reference to the artist_name TextView, and assign the current artist to it.
        TextView artistName = listItem.findViewById(R.id.artist_name);
        artistName.setText(currentSong.getArtistName());

        return listItem;
    }
}
