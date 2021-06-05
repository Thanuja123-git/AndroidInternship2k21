package com.example.examplelife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("THANUJA","First Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("THANUJA","First Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("THANUJA","First Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("THANUJA","First Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("THANUJA","First Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("THANUJA","First Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("THANUJA","First Activity Destroyed");
    }

    public void next(View view) {
        startActivity(new Intent(this,SecondActivity.class));
    }
}


