package com.example.videorecodering;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class first extends AppCompatActivity {
    private VideoView v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        v1=findViewById(R.id.video);

        Uri videoUrl=Uri.parse(getIntent().getExtras().getString("videoUri"));
        v1.setVideoURI(videoUrl);
        v1.start();


    }
}
