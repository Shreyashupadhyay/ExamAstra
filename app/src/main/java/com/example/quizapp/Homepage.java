package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {
    TextView homename,homeemail,homephone;
    Button enterquiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

//        homename=findViewById(R.id.homename);
//        homeemail=findViewById(R.id.homeemail);
//        homephone=findViewById(R.id.homephone);
        enterquiz=findViewById(R.id.enterquiz);

        Intent intent = getIntent();
//        String name =intent.getStringExtra("name");
//        String email =intent.getStringExtra("email");
//        String phone =intent.getStringExtra("phone");

//        homename.setText(name);
//        homeemail.setText(email);
//        homephone.setText(phone);

        enterquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage.this,MainActivity.class));
            }
        });
    }
}