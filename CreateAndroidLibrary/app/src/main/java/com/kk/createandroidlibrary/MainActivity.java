package com.kk.createandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kk.jokedisplay.JokeActivity;
import com.kk.jokesource.JokeSource;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String joke = new JokeSource().getJoke();
        new Intent(this, JokeActivity.class);
    }
}
