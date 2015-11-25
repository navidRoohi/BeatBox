package com.example.navid.beatbox;

/**
 * Created by navid on 11/24/2015.
 */
public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound(String assetPath){
        mAssetPath = assetPath;
        String[] component = assetPath.split("/");
        String filename = component[component.length -1];
        mName = filename.replace(".wav","");
    }


    public String getName() {
        return mName;
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
