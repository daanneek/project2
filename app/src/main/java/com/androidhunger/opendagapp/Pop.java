package com.androidhunger.opendagapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;

import com.androidhunger.navigationdrawerexample.R;

public class Pop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8), (int) (height*.6));

    }
    public void GoToMaps(View v){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/th5DFNRcuoGjCafS9"));
        startActivity(intent);
    }
}
