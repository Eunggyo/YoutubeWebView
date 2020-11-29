package com.aiden.youtubewebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


/*
    Youtube API를 이용한 심플앱


 */
public class MainActivity extends AppCompatActivity {
    YouTubePlayerView mYoutubePlayerView = null;
    Button mPlayBtn = null;
    private static final String API_KEY = "F4:8D:5F:5D:60:47:B1:A2:DC:34:16:36:2E:7E:BF:CB:2F:25:EE:E6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mYoutubePlayerView = findViewById(R.id.youtube_view);
        mPlayBtn = findViewById(R.id.play_toggle_btn);
    }

    private YouTubePlayer.OnInitializedListener mYoutubeListener = new YouTubePlayer.OnInitializedListener() {
        @Override
        public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
            youTubePlayer.loadVideo("iu2tGG6MXNs&t");
        }

        @Override
        public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

        }
    };

    private View.OnClickListener mPlayBtnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mYoutubePlayerView.initialize(API_KEY,mYoutubeListener);
        }
    };
 }