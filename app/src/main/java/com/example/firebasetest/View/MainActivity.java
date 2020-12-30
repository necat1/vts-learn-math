package com.example.firebasetest.View;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firebasetest.PopActivity;
import com.example.firebasetest.R;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button1;
    Button button2;

    MediaPlayer mp;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.blazer_rail);
        mp.setLooping(true);

        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PopActivity.class);
                startActivity(i);
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, HighscoreActivity.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent = new Intent(this, com.example.firebasetest.View.MainActivity3.class);
        startActivity(intent);
    }
}