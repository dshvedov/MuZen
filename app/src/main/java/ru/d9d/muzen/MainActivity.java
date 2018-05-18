package ru.d9d.muzen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Playlist button
         */
        ImageView playlistButton = (ImageView) findViewById(R.id.button_playlist);
        if (playlistButton != null) {
            playlistButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                    startActivity(playlistIntent);
                }
            });
        }

        /**
         * Play button hit
         */
        ImageView playButton = (ImageView) findViewById(R.id.button_play);
        if (playButton != null) {
            playButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast toast=Toast.makeText(getApplicationContext(),"Play button hit",Toast.LENGTH_SHORT);
                    toast.show();
                }
            });
        }

    }
}
