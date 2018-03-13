package com.example.android.miwok;

/**
 * Created by Sara on 28/02/2018.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = HAS_NO_IMAGE;
    private static final int HAS_NO_IMAGE = -1;


    public Word (String miwokTranslation, String defaultTranslation, int imageresourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageresourceId;
    }

    public Word (String miwokTranslation, String defaultTranslation){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
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


}
