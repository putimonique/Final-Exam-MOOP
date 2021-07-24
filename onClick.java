package com.example.moop12;

import android.support.v4.*;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class onClick extends AppCompatActivity;
int number_of_clicks = 0;
@override
protected void onCreate (Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
        }
        public void onClick(View View){
    TextView text = (TextView) findViewById(R.id.textView);
    number_of_clicks++;
    text.setText("Button Clicked"+number_of_clicked);
        }