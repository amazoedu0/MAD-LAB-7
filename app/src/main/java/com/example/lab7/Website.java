package com.example.lab7;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Website extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
    }

    public void openSite(View v)
    {
        EditText urlTExt = (EditText)findViewById(R.id.link_text);
        String url = "https://"+urlTExt.getText().toString();

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }
}