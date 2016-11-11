package io.zipcoder.Util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

/**
 * Created by evanhitchings on 11/11/16.
 */
public class SoundSingleton {
    private Sound backgroundMusic;
    private Sound stairSound;
    private Sound foodSound;
    private Sound keySound;
    private static SoundSingleton instance;

    private SoundSingleton(){
        backgroundMusic = Gdx.audio.newSound(Gdx.files.internal("21_Derelict_Freighter.mp3"));
        stairSound = Gdx.audio.newSound(Gdx.files.internal("door.wav"));
        foodSound = Gdx.audio.newSound(Gdx.files.internal("cha-ching.wav"));
        keySound = Gdx.audio.newSound(Gdx.files.internal("ohyeah.wav"));
        SoundSingleton.instance = this;
    }

    public static SoundSingleton getSoundSingleton(){
        if(SoundSingleton.instance == null){
            return new SoundSingleton();
        }
        return instance;
    }

    public Sound getBackgroundMusic() {
        return backgroundMusic;
    }

    public void setBackgroundMusic(Sound backgroundMusic) {
        this.backgroundMusic = backgroundMusic;
    }

    public Sound getStairSound() {
        return stairSound;
    }

    public void setStairSound(Sound stairSound) {
        this.stairSound = stairSound;
    }

    public Sound getFoodSound() {
        return foodSound;
    }

    public void setFoodSound(Sound foodSound) {
        this.foodSound = foodSound;
    }

    public Sound getKeySound() {
        return keySound;
    }

    public void setKeySound(Sound keySound) {
        this.keySound = keySound;
    }
}
