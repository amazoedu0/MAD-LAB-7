package com.example.lab7;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWebsite(View v)
    {
        Intent intent = new Intent(this,Website.class);
        startActivity(intent);
    }
    public void openMap(View v)
    {
        Intent intent = new Intent(this,Map.class);
        startActivity(intent);
    }
    public void openGallery(View v)
    {
        Intent intent = new Intent(this,Gallery.class);
        startActivity(intent);
    }
    public void openCamera(View v)
    {
        Intent intent = new Intent(this,Camera.class);
        startActivity(intent);
    }

}