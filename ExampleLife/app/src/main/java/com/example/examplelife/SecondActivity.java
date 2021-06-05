package com.example.examplelife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("THANUJA","Second Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("THANUJA","Second Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("THANUJA","Second Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("THANUJA","Second Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("THANUJA","Second Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("THANUJA","Second Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("THANUJA","Second Activity Destroyed");
    }
}