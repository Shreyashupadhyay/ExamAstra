package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.example.quizapp.Splash_screen.list;

public class MainActivity extends AppCompatActivity {

    CountDownTimer timer;
    int timevalue= 180;
    ProgressBar progressBar;
    List<model_class> allques;
    model_class mClass;
    int index=0;
    CardView quesbox,boxA,boxB,boxC,boxD;
    TextView ques,opA,opB,opC,opD,exit;
    LinearLayout next;
    ImageView back;
    int correctcount=0,wrongcount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.progressBartimer);
        quesbox=findViewById(R.id.quesbox);
        boxA=findViewById(R.id.boxA);
        boxB=findViewById(R.id.boxB);
        boxC=findViewById(R.id.boxC);
        boxD=findViewById(R.id.boxD);
        ques=findViewById(R.id.questext);
        opA=findViewById(R.id.optionA);
        opB=findViewById(R.id.optionB);
        opC=findViewById(R.id.optionC);
        opD=findViewById(R.id.optionD);
        next=findViewById(R.id.next);
        back= findViewById(R.id.back);
        exit =findViewById(R.id.exit);

        allques=list;
//        Collections.shuffle(allques);
        mClass=list.get(index);
        setAllData();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Homepage.class));
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDestroy();
            }
        });

        timer= new CountDownTimer(180000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                timevalue=timevalue-1;

                progressBar.setProgress(timevalue);

                }

            @Override
            public void onFinish() {
                Dialog dialog= new Dialog(MainActivity.this);
                dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
                dialog.setContentView(R.layout.time_out_dialog);
                dialog.show();

                dialog.findViewById(R.id.try_again).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this,MainActivity.class));
                    }
                });

            }

        }.start();



    }

    private void setAllData() {
        ques.setText(mClass.getQues());
        opA.setText(mClass.getA());
        opB.setText(mClass.getB());
        opC.setText(mClass.getC());
        opD.setText(mClass.getD());
    }

    private void correctans(CardView box){
//        box.setCardBackgroundColor(getResources().getColor(R.color.green));
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clickenable();
//                boxA.setClickable(true);
//                boxB.setClickable(true);
//                boxC.setClickable(true);
//                boxD.setClickable(true);

                correctcount++;
                index++;
                mClass=list.get(index);

                setAllData();
                resetcolor();
            }
        });

    }
    private void wrongans(CardView box){
//        box.setCardBackgroundColor(getResources().getColor(R.color.red));
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickenable();
//                boxA.setClickable(true);
//                boxB.setClickable(true);
//                boxC.setClickable(true);
//                boxD.setClickable(true);

                wrongcount++;
                if (index<list.size()-1){
                    index++;
                    mClass=list.get(index);
//
                    setAllData();
                }else {
                    Intent intent = new Intent(MainActivity.this,Scorepage.class);
                    intent.putExtra("Wrong",wrongcount);
                    intent.putExtra("Correct",correctcount);
                    startActivity(intent);
                }
                resetcolor();
            }
        });

    }
    private void clickenable(){
        boxA.setClickable(true);
        boxB.setClickable(true);
        boxC.setClickable(true);
        boxD.setClickable(true);
//        Log.d("working", "clickenable: ");
    }
    private void clickdisable(){
        boxA.setClickable(false);
        boxB.setClickable(false);
        boxC.setClickable(false);
        boxD.setClickable(false);
    }
    private void resetcolor(){
        boxA.setBackgroundColor(getResources().getColor(R.color.white));
        boxB.setBackgroundColor(getResources().getColor(R.color.white));
        boxC.setBackgroundColor(getResources().getColor(R.color.white));
        boxD.setBackgroundColor(getResources().getColor(R.color.white));
    }

    public void clickoptionA(View view) {
        if (mClass.getA().equals(mClass.getAns())){
//            boxA .setCardBackgroundColor(getResources().getColor(R.color.green));
            correctans(boxA);
            if (index<list.size()-1){
                correctans(boxA);}else {
                startActivity(new Intent(MainActivity.this,Scorepage.class));}
        }else {
            wrongans(boxA);
        }
        clickdisable();
    }

    public void clickoptionB(View view) {
        if (mClass.getB().equals(mClass.getAns())){
//            boxB.setCardBackgroundColor(getResources().getColor(R.color.green));
            correctans(boxB);
            if (index<list.size()-1){
                correctans(boxB);}else {
                startActivity(new Intent(MainActivity.this,Scorepage.class));}
        }else {
            wrongans(boxB);
        }
        clickdisable();
    }

    public void clickoptionC(View view) {
        if (mClass.getC().equals(mClass.getAns())){
//            boxC.setCardBackgroundColor(getResources().getColor(R.color.green));
            correctans(boxC);
            if (index<list.size()-1){
                correctans(boxC);}else {
                startActivity(new Intent(MainActivity.this,Scorepage.class));
            }
        }else {
            wrongans(boxC);
        }

        clickdisable();
    }

    public void clickoptionD(View view) {
        if (mClass.getD().equals(mClass.getAns())){
//            boxD.setCardBackgroundColor(getResources().getColor(R.color.green));
            correctans(boxD);
            if (index<list.size()-1){
            correctans(boxD);}else {
                startActivity(new Intent(MainActivity.this,Scorepage.class));}
        }else {
            wrongans(boxD);
        }
        clickdisable();
    }
}