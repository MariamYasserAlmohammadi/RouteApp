package com.route.routeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // code executed in many threads
        // add to main thread after specific time
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // intent helps to communicate easily
                // communicate in the same app or between different apps
                Intent intent =new Intent(SplashActivity.this , MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
    // thread -> (Light weight) is a path of execution
    // components of android app
    // Activities -> screen
    // services -> long OP - don't have layout(UI) -happened in background
    // content provider -> transfer data between app components or between apps
    // broadcast Receiver -> ex : receive data about battery - problem in network ..elt
    // intents
}