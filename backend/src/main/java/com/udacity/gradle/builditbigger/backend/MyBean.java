package com.udacity.gradle.builditbigger.backend;

import com.example.javajokes.Jokes;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private Jokes jokes;

    public String getData() {
        return jokes.getJoke();
    }
    public MyBean(){
        jokes = new Jokes();
    }

}