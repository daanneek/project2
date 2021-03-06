package com.androidhunger.opendagapp;


import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import java.util.Calendar;

public class i extends AppCompatActivity {
//Activity that shows the specific information about Informatica, with links to share, more info, a map and add to calender //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);}
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }
    public void goToPop(View v) {
        Intent a = new Intent(this, Pop.class);
        startActivity(a);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void goToPopUp4(View v) {
        Intent a = new Intent(this, popplattegrondenInformatica.class);
        startActivity(a);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }



    public void calender1(View v){
        Calendar beginTime = Calendar.getInstance();
        beginTime.set(2020, 3, 17, 7, 30);
        Calendar endTime = Calendar.getInstance();
        endTime.set(2020, 3, 17, 14, 30);
        Intent intent = new Intent(Intent.ACTION_INSERT)
                .setData(CalendarContract.Events.CONTENT_URI)
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true)
                .putExtra(CalendarContract.Events.TITLE, "Open dag Hogeschool Rotterdam")
                .putExtra(CalendarContract.Events.DESCRIPTION, "Open dag Hogeschool Rotterdam")
                .putExtra(CalendarContract.Events.EVENT_LOCATION, "wijnhaven 103, Rotterdam");
        startActivity(intent);


    }    public void calender2(View v){
        Calendar beginTime = Calendar.getInstance();
        beginTime.set(2020, 0, 6, 7, 30);
        Calendar endTime = Calendar.getInstance();
        endTime.set(2020, 0, 6, 14, 30);
        Intent intent = new Intent(Intent.ACTION_INSERT)
                .setData(CalendarContract.Events.CONTENT_URI)
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true)
                .putExtra(CalendarContract.Events.TITLE, "Open dag Hogeschool Rotterdam")
                .putExtra(CalendarContract.Events.DESCRIPTION, "Open dag Hogeschool Rotterdam")
                .putExtra(CalendarContract.Events.EVENT_LOCATION, "wijnhaven 103, Rotterdam");
        startActivity(intent);

    }
    public void share1(View v) {
        String date = "Vrijdag 17 april 2020";
        String opleiding = "Informatica";
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Ik ga op " + date + " naar een open dag voor " + opleiding + " op Hogeschool rotterdam! Ga jij ook? https://www.hogeschoolrotterdam.nl/voorlichting/hulp-bij-studiekeuze/open-dag/";
        String shareSub = "Open dag";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));
    }

    public void share2(View v) {
        String date = "Maandag 6 januari 2020";
        String opleiding = "Informatica";
        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody = "Ik ga op " + date + " naar een open dag voor " + opleiding + " op Hogeschool rotterdam! Ga jij ook? https://www.hogeschoolrotterdam.nl/voorlichting/hulp-bij-studiekeuze/open-dag/";
        String shareSub = "Open dag";
        myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(myIntent, "Share using"));

    }

}
