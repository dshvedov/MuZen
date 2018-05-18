package ru.d9d.muzen;

import java.util.Locale;

public class Track {
    /**
     * Track title
     */
    private String mTitle;
    /**
     * Track artist
     */
    private String mArtist;
    /**
     * Track time (length), in seconds.
     */
    private int mTrackLength;
    /**
     * Track artwork (cover) image
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new track object
     *
     * @param title       - track title
     * @param artist      - track artist
     * @param trackLength - track length (in seconds)
     */
    public Track(String title, String artist, int trackLength) {
        mTitle = title;
        mArtist = artist;
        mTrackLength = trackLength;
    }

    /**
     * Create a new track object
     *
     * @param title           - track title
     * @param artist          - track artist
     * @param trackLength     - track length (in seconds)
     * @param imageResourceId - image resource Id
     */
    public Track(String title, String artist, int trackLength, int imageResourceId) {
        mTitle = title;
        mArtist = artist;
        mTrackLength = trackLength;
        mImageResourceId = imageResourceId;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getTitle() {
        return mTitle;
    }

    public int getImageId() {
        return mImageResourceId;
    }

    /**
     * Return track length as time string
     *
     * @return String format hours:minutes:seconds
     */
    public String getTrackLengthString() {
        int hours = mTrackLength / 3600;
        int minutes = (mTrackLength % 3600) / 60;
        int seconds = mTrackLength % 60;
        return String.format(Locale.US, "%02d:%02d:%02d", hours, minutes, seconds);
    }

    /**
     * Check if track has cover image associated
     *
     * @return boolean value
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
