package com.hormiga6.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hormiga6.mylibrary.Hoge;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hoge.print();
    }
}
