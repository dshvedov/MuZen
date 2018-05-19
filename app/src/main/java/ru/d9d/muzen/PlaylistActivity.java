package ru.d9d.muzen;

import android.content.res.Resources;
import android.content.res.TypedArray;
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
         * Test tracks data from resources
         * TODO: Fill with real data
         */

        // Get track resources into arrays
        Resources res = getResources();
        String[] arrTitles = res.getStringArray(R.array.track_titles);
        String[] arrArtists = res.getStringArray(R.array.track_artists);
        int[] arrLengths = res.getIntArray(R.array.track_lengths);
        TypedArray arrImages = res.obtainTypedArray(R.array.track_images);

        // Add tracks data from arrays
        for (int i = 0; i < arrTitles.length; i++) {
            int imageRes = arrImages.getResourceId(i, -1); // -1 if no image cover provided
            tracks.add(new Track(arrTitles[i], arrArtists[i], arrLengths[i], imageRes));
        }
        arrImages.recycle();

        /**
         * Setting TrackAdapter for ListView
         */
        TrackAdapter adapter = new TrackAdapter(this, tracks);
        final ListView lv = findViewById(R.id.list);
        lv.setAdapter(adapter);

    }
}
