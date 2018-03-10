package com.elshadsm.custom.jokelib;

import java.util.Random;

public class JokeProvider {
    private String jokeArray[] = {
            "First test joke",
            "Second test joke",
            "Third test joke",
            "Fourth test joke",
            "Fifth test joke",
            "Sixth test joke"
    };

    public String getJoke() {
        Random rand = new Random();
        int value = rand.nextInt(jokeArray.length - 1);
        return jokeArray[value];
    }
}
