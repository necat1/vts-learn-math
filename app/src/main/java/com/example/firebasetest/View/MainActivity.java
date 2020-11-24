package com.example.firebasetest.View;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.example.firebasetest.R;
import com.plattysoft.leonids.ParticleSystem;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button1;
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
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                renderParticles(v);
                openHighscoreActivity();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                renderParticles(v);
                openActivity3();
            }
        });
    }

    public void openHighscoreActivity() {
        Intent intent = new Intent(this, HighscoreActivity.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent = new Intent(this, com.example.firebasetest.View.MainActivity3.class);
        startActivity(intent);
    }

    public void renderParticles(View v) {
        new ParticleSystem(MainActivity.this, 100, R.drawable.particle,2000)
                .setSpeedRange(0.5f, 1.0f)
                .oneShot(v, 50);

        v.animate().scaleX(0.25f).scaleY(0.25f).setDuration(200);
    }


    @Override
    protected void onStart() {
        super.onStart();
        button1.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100);
        button.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100);

        mp.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mp.stop();
    }
}