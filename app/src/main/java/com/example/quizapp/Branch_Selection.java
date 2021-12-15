package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Branch_Selection extends AppCompatActivity {
    ImageView eng,med;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch_selection);
        eng=findViewById(R.id.eng);
        med=findViewById(R.id.med);
//        oth=findViewById(R.id.oth);

        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Branch_Selection.this,Homepage.class));
            }
        });

        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Branch_Selection.this,Homepage.class));
            }
        });

//        oth.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(Branch_Selection.this,Homepage.class));
//            }
//        });

    }
}