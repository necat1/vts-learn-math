package com.example.firebasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.firebasetest.View.MainActivity;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class NameActivity extends AppCompatActivity {

    private TextView tv;
    private EditText nameEt;
    private Button okBtn;

    private int score;
    private long time;
    private int maxTime;

    private String name;

    private FirebaseFirestore firestore;

    Map<String, Object> user = new HashMap<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        tv = (TextView)findViewById(R.id.textView2);
        nameEt = (EditText)findViewById(R.id.namePlainText);
        okBtn = (Button)findViewById(R.id.button3);
        score = getIntent().getExtras().getInt("score");
        time = getIntent().getExtras().getLong("time");
        maxTime = (int)(getIntent().getExtras().getLong("maxTime") / 1000);
        firestore = FirebaseFirestore.getInstance();


        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameEt.getText().toString();

                user.put("score", calcScore(score, maxTime, time));
                user.put("name", name);
                firestore.collection("users").document(name).set(user);
                openActivity();
            }
        });
    }


    public void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private int calcScore(int score, int maxTime, long leftTime) {
        leftTime = (leftTime / 1000) % 60;
        return (int)(((float)leftTime / maxTime) * 100 * score);
    }

}