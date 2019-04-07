package com.example.androidlibforjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokes extends AppCompatActivity {

    TextView jokeDis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);
        jokeDis = findViewById(R.id.jokeDis);
        String joke = getIntent().getStringExtra("Joke");
        jokeDis.setText(joke);
    }
}
