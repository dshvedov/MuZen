package ru.d9d.muzen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

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
        tracks.add(new Track("Don't Stop Me Now", "Queen", 210, R.drawable.cover_queen_dontstopme));
        tracks.add(new Track("Dancing with Kadafi", "Infected Mushroom", 619, R.drawable.cover_im_bpempire));
        tracks.add(new Track("Don't Stop Me Now", "Queen", 210, R.drawable.cover_queen_dontstopme));
        tracks.add(new Track("Dancing with Kadafi", "Infected Mushroom", 619, R.drawable.cover_im_bpempire));
        tracks.add(new Track("Don't Stop Me Now", "Queen", 210, R.drawable.cover_queen_dontstopme));
        tracks.add(new Track("Dancing with Kadafi", "Infected Mushroom", 619, R.drawable.cover_im_bpempire));
        tracks.add(new Track("Don't Stop Me Now", "Queen", 210, R.drawable.cover_queen_dontstopme));
        tracks.add(new Track("Dancing with Kadafi", "Infected Mushroom", 619, R.drawable.cover_im_bpempire));
        tracks.add(new Track("Don't Stop Me Now", "Queen", 210, R.drawable.cover_queen_dontstopme));
        tracks.add(new Track("Dancing with Kadafi", "Infected Mushroom", 619, R.drawable.cover_im_bpempire));

        /**
         * Setting TrackAdapter for ListView
         */
        TrackAdapter adapter = new TrackAdapter(this, tracks);
        final ListView lv = findViewById(R.id.list);
        lv.setAdapter(adapter);

    }
}
