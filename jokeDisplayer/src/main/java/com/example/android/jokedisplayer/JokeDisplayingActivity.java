package com.example.android.jokedisplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class JokeDisplayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displaying);

        Bundle joke = getIntent().getExtras();
        String joke_string = joke.getString("joke_key");
        Toast.makeText(this, joke_string, Toast.LENGTH_SHORT).show();
    }
}
