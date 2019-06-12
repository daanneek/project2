package com.androidhunger.opendagapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidhunger.opendagapp.R;

public class Splashscreen extends AppCompatActivity {
    //startup screen that shows when you launch the app, is enabled in mainactivity//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(i);
                finish(); } }, 500);
    }

    }

