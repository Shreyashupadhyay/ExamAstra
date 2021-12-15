package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

public class Scorepage extends AppCompatActivity {
    CircularProgressBar progressBar;
    TextView resultext,exit;
    LinearLayout sharebtn;
    int wrong,correct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorepage);
        progressBar =findViewById(R.id.progressBar);
        resultext=findViewById(R.id.resultext);
        sharebtn= findViewById(R.id.sharebtn);
        exit=findViewById(R.id.exit);

        wrong=getIntent().getIntExtra("Wrong",0);
        correct=getIntent().getIntExtra("Correct",0);

        progressBar.setProgress(correct);
        resultext.setText(correct+"/30");

        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "I Got "+correct+ " out of 30" + BuildConfig.APPLICATION_ID);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Scorepage.this,Branch_Selection.class));
            }
        });

    }
}