package com.example.lab7;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void openMap(View v)
    {
        EditText locTExt = (EditText)findViewById(R.id.city_name);
        String loc = "geo:0,0?q="+locTExt.getText().toString();

        Uri gmmIntentUri = Uri.parse(loc);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}