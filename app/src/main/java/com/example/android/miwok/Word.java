package com.example.android.miwok;

/**
 * Created by Sara on 28/02/2018.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

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
}
