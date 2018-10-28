package com.example.seamus.thomasthetankengine;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    public static ImageView  imageView_thomasFace, imageView_thomasFaceSmile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView_thomasFace = (ImageView) findViewById(R.id.imageView_thomasFace);
        imageView_thomasFaceSmile = (ImageView) findViewById(R.id.imageView_thomasFaceSmile);
        imageView_thomasFace.setVisibility(View.VISIBLE);
        imageView_thomasFaceSmile.setVisibility(View.GONE);


    }

    public void thomasFaceClick(View view) {
        try {
            MediaPlayer player = new MediaPlayer();
            player.setAudioStreamType(AudioManager.STREAM_MUSIC);
            player.setDataSource("https://firebasestorage.googleapis.com/v0/b/thomas-656d9.appspot.com/o/Thomas%20New%20Theme%20Tune.mp3?alt=media&token=5b16707c-3313-4364-8c8c-fbde33327bff");
            player.prepare();
            player.start();
        } catch (Exception e) {
            // TODO: handle exception
        }
        imageView_thomasFace.setVisibility(View.GONE);
        imageView_thomasFaceSmile.setVisibility(View.VISIBLE);

    }


    public void thomasFaceSmileClick(View view) {
        try {
            MediaPlayer player = new MediaPlayer();
            player.setAudioStreamType(AudioManager.STREAM_MUSIC);
            player.setDataSource("https://firebasestorage.googleapis.com/v0/b/thomas-656d9.appspot.com/o/Thomas%20New%20Theme%20Tune.mp3?alt=media&token=5b16707c-3313-4364-8c8c-fbde33327bff");
            player.prepare();
            player.start();
        } catch (Exception e) {
            // TODO: handle exception
        }
        imageView_thomasFace.setVisibility(View.VISIBLE);
        imageView_thomasFaceSmile.setVisibility(View.GONE);
    }

    public void thomasFaceClick2(View view) {



    }

    public void thomasFaceSmileClick2(View view) {



    }

    public void thomasFaceClick3(View view) {
    }

    public void thomasFaceClick4(View view) {
    }

    public void thomasFaceSmileClick3(View view) {
    }

    public void thomasFaceSmileClick4(View view) {
    }
}
