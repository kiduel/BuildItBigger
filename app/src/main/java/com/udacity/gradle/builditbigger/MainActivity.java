package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.android.jokedisplayer.JokeDisplayingActivity;
import com.example.android.telljoke.Joke;


public class MainActivity extends AppCompatActivity {
    public String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {

        String tell_me_joke = new Joke().getJoke();
        Intent intent = new Intent(getApplicationContext(), JokeDisplayingActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(JOKE_KEY, tell_me_joke);
        intent.putExtras(bundle);
        startActivity(intent);
//        Toast.makeText(this, tell_me_joke, Toast.LENGTH_SHORT).show();
    }
}
