package com.route.routeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
      if( v.getId()==R.id.btn_android||v.getId()==R.id.img_android){
          startCourseDetailsActivity(Constants.ANDROID_COURSE);
          return;
      }
        if( v.getId()==R.id.btn_ios||v.getId()==R.id.img_ios){
            startCourseDetailsActivity(Constants.IOS_COURSE);
            return;
        }
        if( v.getId()==R.id.btn_fullStack||v.getId()==R.id.img_fullStack){
            startCourseDetailsActivity(Constants.FULLSTACK_COURSE);

        }


    }

    private void startCourseDetailsActivity(String courseName) {
        Intent intent =new Intent(this,CourseDetailsActivity.class);
        // extra take key , value
        intent.putExtra(Constants.course ,courseName );
        startActivity(intent);

    }
}
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        androidButton=findViewById(R.id.btn_1);
//        iosButton=findViewById(R.id.btn_2);
//        fullStackButton=findViewById(R.id.btn_3);
//        androidButton.setOnClickListener(this);
//        iosButton.setOnClickListener(this);
//        fullStackButton.setOnClickListener(this);
//    }
//
//    public void onClick(View view) {
//        if (view.getId() == R.id.btn_1) {
//            Intent intent =new Intent(this , AndroidActivity.class);
//            startActivity(intent);
//        } else if (view.getId() == R.id.btn_2) {
//            Intent intent =new Intent(this , IosActivity.class);
//            startActivity(intent);
//        }else if (view.getId() == R.id.btn_3) {
//            Intent intent =new Intent(this , FullStackActivity.class);
//            startActivity(intent);
//        }
//    }
