package com.annhienktuit.facade;

import android.content.Context;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.StyledPlayerView;

public class VideoPlayerFacade implements MediaPlayer{

    private Context context;
    private String videoUri;
    private ExoPlayer player;
    private StyledPlayerView playerView;
    private MediaItem mediaItem;

    public VideoPlayerFacade(Context context, String mediaUri, StyledPlayerView playerView){
        this.context = context;
        this.videoUri = mediaUri;
        this.playerView = playerView;
    }

    @Override
    public void initializePlayer() {
        player = new ExoPlayer.Builder(context).build();
    }

    @Override
    public void initializeMediaItem() {
        mediaItem = MediaItem.fromUri(videoUri);
    }

    @Override
    public void setMediaItem() {
        player.setMediaItem(mediaItem);
    }

    @Override
    public void setPlayerView() {
        this.playerView.setPlayer(player);
    }

    @Override
    public void pause() {
        player.pause();
    }

    @Override
    public void stop() {
        player.stop();
    }

    @Override
    public void play() {
        initializePlayer();
        initializeMediaItem();
        setMediaItem();
        setPlayerView();
        player.prepare();
        player.play();
    }
}
