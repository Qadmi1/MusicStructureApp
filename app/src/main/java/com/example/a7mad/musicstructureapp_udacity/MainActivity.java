package com.example.a7mad.musicstructureapp_udacity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a reference to the blues Button
        Button bluesButton = findViewById(R.id.blues);

        // Create a reference to the rock Button
        Button rockButton = findViewById(R.id.rock);

        // Create a reference to the blues Button
        Button popButton = findViewById(R.id.pop);

        // set a click listener that will open the BluesMusic
        bluesButton.setOnClickListener(this);

        // set a click listener that will open the RockMusic
        rockButton.setOnClickListener(this);

        // set a click listener that will open the PopMusic
        popButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.blues:
                Intent bluesIntent = new Intent(MainActivity.this, BluesMusic.class);
                startActivity(bluesIntent);
                break;
            case R.id.rock:
                Intent rockIntent = new Intent(MainActivity.this, RockMusic.class);
                startActivity(rockIntent);
            case R.id.pop:
                Intent popIntent = new Intent(MainActivity.this, PopMusic.class);
                startActivity(popIntent);
                break;
        }


    }
}
