package ru.d9d.muzen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        /**
         * Adding tracks data as ArrayList
         */
        ArrayList<Track> tracks = new ArrayList<>();

        /**
         * Test tracks data
         * TODO: Fill with real data
         */
        tracks.add(new Track("Don't Stop Me Now","Queen",210,R.drawable.cover_queen_dontstopme));
        tracks.add(new Track("Dancing with Kadafi","Infected Mushroom",619,R.drawable.cover_im_bpempire));
        tracks.add(new Track("Don't Stop Me Now","Queen",210,R.drawable.cover_queen_dontstopme));
        tracks.add(new Track("Dancing with Kadafi","Infected Mushroom",619,R.drawable.cover_im_bpempire));
        tracks.add(new Track("Don't Stop Me Now","Queen",210,R.drawable.cover_queen_dontstopme));
        tracks.add(new Track("Dancing with Kadafi","Infected Mushroom",619,R.drawable.cover_im_bpempire));
        tracks.add(new Track("Don't Stop Me Now","Queen",210,R.drawable.cover_queen_dontstopme));
        tracks.add(new Track("Dancing with Kadafi","Infected Mushroom",619,R.drawable.cover_im_bpempire));
        tracks.add(new Track("Don't Stop Me Now","Queen",210,R.drawable.cover_queen_dontstopme));
        tracks.add(new Track("Dancing with Kadafi","Infected Mushroom",619,R.drawable.cover_im_bpempire));

        /**
         * Setting TrackAdapter for ListView
         */
        TrackAdapter adapter = new TrackAdapter(this, tracks);
        final ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(adapter);

        /**
         * Add ClickListener for list items
         */

        /*
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = lv.getItemAtPosition(position);
                Log.v("Playlist",o.toString());
                Toast.makeText(PlaylistActivity.this, "List item was clicked at " + position, Toast.LENGTH_SHORT).show();
            }
        });
        */

        /*
        ImageView playButton = (ImageView) findViewById(R.id.play_button_track);

        if (playButton != null) {
            playButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent playerIntent = new Intent(PlaylistActivity.this, MainActivity.class);
                    startActivity(playerIntent);
                }
            });
        }
        */

    }
}
