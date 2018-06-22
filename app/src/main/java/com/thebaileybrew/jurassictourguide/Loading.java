package com.thebaileybrew.jurassictourguide;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.sql.Array;
import java.util.ArrayList;

import me.zhanghai.android.materialprogressbar.MaterialProgressBar;

public class Loading extends AppCompatActivity {

    ValueAnimator mProgressAnimator, mProgressAnimatorTwo, mProgressAnimatorThree;
    String textMessages[];
    //int messageCount = textMessages.length;
    Animation in, out;
    TextView textViewSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textMessages = getResources().getStringArray(R.array.textMessages);
        setContentView(R.layout.now_loading);
        MaterialProgressBar progressBarBottom = findViewById(R.id.jurassic_progress_background_bottom);
        MaterialProgressBar progressBar = findViewById(R.id.jurassic_progress);
        MaterialProgressBar progressBarTwo = findViewById(R.id.jurassic_progress_background);
        mProgressAnimator = ProgressAnimator.makeProgressAnimator(progressBar);
        mProgressAnimatorTwo = ProgressAnimator.makeProgressAnimatorTwo(progressBarTwo);
        mProgressAnimatorThree = ProgressAnimator.makeProgressAnimatorThree(progressBarBottom);
        textViewSwitch = findViewById(R.id.text_loading);
        in = AnimationUtils.loadAnimation(this, R.anim.fadein);
        out = AnimationUtils.loadAnimation(this,R.anim.fadeout);
        startRunnables();


    }

    private void startRunnables() {
        final Handler mHandler = new Handler();
        final MediaPlayer mp = MediaPlayer.create(Loading.this, R.raw.welcome_to_jurassic_park);
        //Load first string text
        Runnable animRunnable = new Runnable() {
            @Override
            public void run() {
                textViewSwitch.setText(textMessages[0]);
            }
        };
        mHandler.postDelayed(animRunnable, 4000);
        //Load second string text
        Runnable animRunnable2 = new Runnable() {
            @Override
            public void run() {
                textViewSwitch.setAnimation(out);
                textViewSwitch.setAnimation(in);
                textViewSwitch.setText(textMessages[1]);
            }
        };
        mHandler.postDelayed(animRunnable2, 6000);
        //Load third string text
        Runnable animRunnable3 = new Runnable() {
            @Override
            public void run() {
                textViewSwitch.setAnimation(out);
                textViewSwitch.setAnimation(in);
                textViewSwitch.setText(textMessages[2]);
            }
        };
        mHandler.postDelayed(animRunnable3, 8000);
        //Load fourth string text
        Runnable animRunnable4 = new Runnable() {
            @Override
            public void run() {
                textViewSwitch.setAnimation(out);
                textViewSwitch.setAnimation(in);
                textViewSwitch.setText(textMessages[3]);
            }
        };
        mHandler.postDelayed(animRunnable4, 10000);
        //Load fifth string text
        Runnable animRunnable5 = new Runnable() {
            @Override
            public void run() {
                textViewSwitch.setAnimation(out);
                textViewSwitch.setAnimation(in);
                textViewSwitch.setText(textMessages[4]);
            }
        };
        mHandler.postDelayed(animRunnable5, 12000);
        //Load sixth string text
        Runnable animRunnable6 = new Runnable() {
            @Override
            public void run() {
                textViewSwitch.setAnimation(out);
                textViewSwitch.setAnimation(in);
                textViewSwitch.setText(textMessages[5]);
            }
        };
        mHandler.postDelayed(animRunnable6, 14000);
        //Load last string text & play media file 'Welcome to Jurassic Park'
        Runnable animRunnable7 = new Runnable() {
            @Override
            public void run() {
                mp.setLooping(false);
                mp.start();
                textViewSwitch.setAnimation(out);
                textViewSwitch.setAnimation(in);
                textViewSwitch.setText(textMessages[6]);
            }
        };
        mHandler.postDelayed(animRunnable7, 16000);
        //Request Main Activity & stop/release MediaPlayer
        Runnable openRunnable = new Runnable() {
            @Override
            public void run() {
                mp.stop();
                mp.release();
                openTourApp();
            }
        };
        mHandler.postDelayed(openRunnable,24000);
    }

    private void openTourApp() {
        //Intent call for the MainActivity
        Intent openTourGuideMain = new Intent(this, MainActivity.class);
        this.startActivity(openTourGuideMain);
    }

}
