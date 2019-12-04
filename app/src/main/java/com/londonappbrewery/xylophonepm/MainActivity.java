package com.londonappbrewery.xylophonepm;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: Create a new SoundPool
        AudioAttributes attributes = new AudioAttributes.Builder().setLegacyStreamType(AudioManager.STREAM_MUSIC).build();
        mSoundPool = new SoundPool.Builder().setAudioAttributes(attributes).setMaxStreams(NR_OF_SIMULTANEOUS_SOUNDS).build();
        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = mSoundPool.load(this,R.raw.note1_c,PRIORITY);
        mDSoundId = mSoundPool.load(this,R.raw.note2_d,PRIORITY);
        mESoundId = mSoundPool.load(this,R.raw.note3_e,PRIORITY);
        mFSoundId = mSoundPool.load(this,R.raw.note4_f,PRIORITY);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,PRIORITY);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,PRIORITY);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,PRIORITY);
    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View v){
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playD(View v){
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playE(View v){
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playF(View v){
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playG(View v){
        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playA(View v){
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playB(View v){
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
}
