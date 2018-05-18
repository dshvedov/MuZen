package ru.d9d.muzen;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class TrackAdapter extends ArrayAdapter<Track> {
    public TrackAdapter(Activity context, ArrayList<Track> tracks){
        super(context, 0, tracks);
    }

    /**
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    public View getView(int position,  View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.track_item, parent, false);
        }

        final Track track = getItem(position);

        /**
         * Set track title and artist
         */
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(track.getTitle());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(track.getArtist());

        /**
         * Set cover art if available
         */
        ImageView imageImageView = (ImageView) listItemView.findViewById(R.id.image);
        if (track.hasImage()) {
            imageImageView.setImageResource(track.getImageId());
        } else {
            imageImageView.setVisibility(View.INVISIBLE);
        }

        /**
         * setOnClickListener for play button
         */
        ImageView playButton = (ImageView) listItemView.findViewById(R.id.play_button_track);
        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent playerIntent = new Intent(getContext(), MainActivity.class);
                getContext().startActivity(playerIntent);
            }
        });


        return listItemView;
    }


}
