package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this,"Hello Toast",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"Hello Toast",Toast.LENGTH_SHORT).show();
    }
}