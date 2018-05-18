package ru.d9d.muzen;

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
    private static final int NO_IMAGE_PROVIDED=-1;

    /**
     * Create a new track object
     *
     * @param title
     * @param artist
     * @param trackLength
     */
    public Track(String title, String artist, int trackLength){
       mTitle=title;
       mArtist=artist;
       mTrackLength=trackLength;
    }
    public Track(String title, String artist, int trackLength, int imageResourceId){
        mTitle=title;
        mArtist=artist;
        mTrackLength=trackLength;
        mImageResourceId=imageResourceId;
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
     * Return track length, converted into hours:minutes:seconds format
     * @return
     */
    public String getTrackLengthString() {
        int hours = mTrackLength / 3600;
        int minutes = (mTrackLength % 3600) / 60;
        int seconds = mTrackLength % 60;
        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return timeString;
    }

    /**
     * Check if track has cover image associated
     * @return
     */
    public boolean hasImage() {
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

}
