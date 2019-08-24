package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView aircraft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aircraft = findViewById(R.id.imageView);
    }

    @Override
    protected  void onPause() {
        super.onPause();
        aircraft.setImageResource(R.drawable.f02);
    }
}
