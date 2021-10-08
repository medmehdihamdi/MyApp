package com.example.application_tp_011;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello debug");
        Log.e("MainActivity", "Hello error");
        Log.i("MainActivity", "Hello information");
        Log.w("MainActivity", "Hello warning");
    }
}