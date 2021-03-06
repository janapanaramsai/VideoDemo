package com.example.ramsai.videodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video = (VideoView)findViewById(R.id.videoView);//creating vide0 view
        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);//setting video path

        MediaController mediaController = new MediaController(this);//creating new media controller
        mediaController.setAnchorView(video);//setting view for controller
        video.setMediaController(mediaController);//Assigning media controller for video.

        video.start();


    }
}
