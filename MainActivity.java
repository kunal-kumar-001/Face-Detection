package com.example.mlkunal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mlkunal.helpers.ImageHelperActivity;
import com.example.mlkunal.image.FaceDetectionActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGotoFaceDetection(View view) {
        // start the image helper activity
        Intent intent = new Intent(this, FaceDetectionActivity.class);
        startActivity(intent);
    }


}
