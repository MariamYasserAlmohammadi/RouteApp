package com.route.routeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseDetailsActivity extends AppCompatActivity {
    ImageView courseImv;
    TextView courseDetailsTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);
        courseImv =findViewById(R.id.imv_course);
        courseDetailsTv =findViewById(R.id.tv_course_details);
        courseDetailsTv.setMovementMethod(new ScrollingMovementMethod());
        Intent intent = getIntent();
        if (intent==null)
            return;
        String courseName =intent.getStringExtra(Constants.course);
        switch (courseName){
            case Constants.ANDROID_COURSE:{
                courseDetailsTv.setText(Constants.ANDROID_DETAILS);
                courseImv.setImageResource(R.drawable.android);
                break;
            }
            case Constants.IOS_COURSE:{
                courseDetailsTv.setText(Constants.IOS_DETAILS);
                courseImv.setImageResource(R.drawable.ios);
                break;
            }
            case Constants.FULLSTACK_COURSE:{
                courseDetailsTv.setText(Constants.FULLSTACK_DETAILS);
                courseImv.setImageResource(R.drawable.full_stack);
                break;
            }
        }
    }
}