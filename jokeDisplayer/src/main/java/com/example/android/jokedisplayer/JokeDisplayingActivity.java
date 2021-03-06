package com.example.android.jokedisplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayingActivity extends AppCompatActivity {

    TextView textView;
    public static String JOKE_KEY = "joke_key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displaying);
        textView = (TextView) findViewById(R.id.joke_text_view);

        if (getIntent().hasExtra(JOKE_KEY)){
            String joke_string = getIntent().getStringExtra(JOKE_KEY);
            textView.setText(joke_string);
        }
    }
}
