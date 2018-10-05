package com.example.android.telljoke;

import java.util.Random;

public class Joke {

    private final String[] jokes = {
            "An Android app walks into a bar. Bartender asks, “Can I get you a drink?” The app looks disappointed and says, “That wasn’t my intent.",
            "There's a band called 1023MB. They haven't had any gigs yet.",
            "Did you hear about the crook who stole a calendar? He got twelve months.",
            "Did you hear about the semi-colon that broke the law? He was given two consecutive sentences.",
            "So what if I don’t know what “Armageddon” means? It’s not the end of the world.",
            "Do I lose when the police officer says papers and I say scissors?"
    };


    public String getJoke() {
        int index = new Random().nextInt(jokes.length);
        return jokes[index];
    }
}
