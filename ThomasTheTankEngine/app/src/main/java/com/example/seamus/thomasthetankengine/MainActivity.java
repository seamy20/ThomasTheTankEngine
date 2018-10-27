package com.example.seamus.thomasthetankengine;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void thomasFaceClick(View view) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            try
            {
                mediaPlayer.setDataSource("gs://thomas-656d9.appspot.com/thomasanthem.mp3");
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                mediaPlayer.prepare();
         }catch (IOException e)
            {

                e.printStackTrace();
            }


    }

    public void play_song(View view) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        try
        {
            mediaPlayer.setDataSource("gs://thomas-656d9.appspot.com/thomasanthem.mp3");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });

            mediaPlayer.prepare();
        }catch (IOException e)
        {

            e.printStackTrace();
        }


    }
}
