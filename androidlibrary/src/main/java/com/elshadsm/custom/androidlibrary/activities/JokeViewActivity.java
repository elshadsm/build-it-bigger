package com.elshadsm.custom.androidlibrary.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.elshadsm.custom.androidlibrary.R;

public class JokeViewActivity extends AppCompatActivity {

    public static final String INTENT_JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_view);
        String joke = getIntent().getStringExtra(INTENT_JOKE_KEY);
        TextView textViewJoke = findViewById(R.id.jokeTextView);
        textViewJoke.setText(joke);
    }
}
