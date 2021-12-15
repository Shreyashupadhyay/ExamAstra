package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegistrationPage extends AppCompatActivity {
    EditText regname,regemail,regphone;
    Button regbutton;
    FirebaseDatabase database;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
        regname = findViewById(R.id.regname);
        regemail = findViewById(R.id.regemail);
        regphone = findViewById(R.id.regphone);
        regbutton = findViewById(R.id.regbutton);

        regbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = regname.getText().toString().trim();
                String email = regemail.getText().toString().trim();
                String phone = regphone.getText().toString().trim();
                database= FirebaseDatabase.getInstance();
                if (name.isEmpty()||email.isEmpty()||phone.isEmpty()){
                    Toast.makeText(RegistrationPage.this, "Something is Missing", Toast.LENGTH_SHORT).show();
                }else{
                    Userdatail userdatail =new Userdatail(name,email,phone);
                    reference=database.getReference().child("User");
                    reference.child(name).setValue(userdatail);
                    Intent intent= new Intent(RegistrationPage.this,Branch_Selection.class);
//                    intent.putExtra("name",name);
//                    intent.putExtra("email",email);
//                    intent.putExtra("phone",phone);
                    startActivity(intent);
                }
            }
        });
    }
}