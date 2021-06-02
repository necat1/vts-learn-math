package com.example.firebasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.firebasetest.View.MainActivity;
import com.example.firebasetest.View.QuestionLibraryE;
import com.example.firebasetest.View.QuestionLibraryM;

public class ExpertActivity extends AppCompatActivity {
    Button button;
    private QuestionLibraryE mQuestionLibrary = new QuestionLibraryE();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);
        button = (Button) findViewById(R.id.back);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);


        updateQuestion();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });

        //Start of Button Listener for Button1

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //My logic for Button goes in here
                if(mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 3;
                    updateScore(mScore);
                }

                if (mQuestionNumber == 9){
                    openName();
                }
                updateQuestion();
            }
        });
        //End of the Button Listener for Button1

        //Start of Button Listener for Button2

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //My logic for Button goes in here
                if(mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 3;
                    updateScore(mScore);
                }

                if (mQuestionNumber == 9){
                    openName();
                }
                updateQuestion();
            }
        });
        //End of the Button Listener for Button2

        //Start of Button Listener for Button3

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //My logic for Button goes in here
                if(mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 3;
                    updateScore(mScore);
                }

                if (mQuestionNumber == 9){
                    openName();
                }
                updateQuestion();
            }
        });
        //End of the Button Listener for Button3
    }
    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice5(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice6(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice7(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice8(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice9(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice10(mQuestionNumber));


        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }


    private  void updateScore(int point){
        mScoreView.setText("" + mScore);
    }
    public void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openName() {
        Intent intent = new Intent(this, NameActivity.class);
        intent.putExtra("score", mScore);
        startActivity(intent);
    }
}