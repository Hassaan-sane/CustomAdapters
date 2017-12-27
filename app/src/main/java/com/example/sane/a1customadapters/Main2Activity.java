package com.example.sane.a1customadapters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String value = null;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("name");

        }
//        Intent myintent = getIntent();
//
//        String name = myintent.getStringExtra("name");

        TextView Name = (TextView) findViewById(R.id.name );
        Name.setText(value);
        Log.d(TAG, ""+value);


    }
}
