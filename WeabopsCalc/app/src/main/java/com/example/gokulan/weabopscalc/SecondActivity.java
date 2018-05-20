package com.example.gokulan.weabopscalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();

        String value = i.getStringExtra("Output");

        TextView textView = findViewById(R.id.textview);

        textView.setText(value);
    }
}
