package com.annhienktuit.facade;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.StyledPlayerView;

public interface MediaPlayer {

    void initializePlayer();

    void initializeMediaItem();

    void setMediaItem();

    void setPlayerView();

    void pause();

    void stop();

    void play();
}
