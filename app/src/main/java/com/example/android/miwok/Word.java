package com.example.android.miwok;

/**
 * Created by Sara on 28/02/2018.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = HAS_NO_IMAGE;
    private static final int HAS_NO_IMAGE = -1;
    private int mAudioResourceId;


    /**
     * Constructor for words having image
     * @param miwokTranslation
     * @param defaultTranslation
     * @param imageResourceId
     * @param audioResourceId
     */
    public Word (String miwokTranslation, String defaultTranslation, int imageResourceId, int audioResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Constructor for the words having no image
     * @param miwokTranslation
     * @param defaultTranslation
     * @param audioResourceId
     */

    public Word (String miwokTranslation, String defaultTranslation, int audioResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId () {
        return mImageResourceId;
    }

    public boolean hasImage () {
        return mImageResourceId != HAS_NO_IMAGE;
    }

    public int getAudioResourceId () {
        return mAudioResourceId;
    }

}
