package com.annhienktuit.facade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ui.StyledPlayerView;

public class MainActivity extends AppCompatActivity {

    private final String videoUri = "https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4";

    private StyledPlayerView playerView;

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerView = findViewById(R.id.playerView);

        //Normal initialization
//        MediaItem mediaItem = MediaItem.fromUri(videoUri);
//        player = new ExoPlayer.Builder(this).build();
//        playerView.setPlayer(player);
//        player.setMediaItem(mediaItem);
//        player.prepare();
//        player.play();

        //Facade Initialization
        VideoPlayerFacade videoPlayerFacade = new VideoPlayerFacade(this, videoUri, playerView);
        videoPlayerFacade.play();

    }
}