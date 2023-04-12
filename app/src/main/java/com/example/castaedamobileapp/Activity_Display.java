package com.example.castaedamobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Button btnOk = findViewById(R.id.btnOk);
        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewGender = findViewById(R.id.textViewGender);
        TextView textViewBdate = findViewById(R.id.textViewBdate);
        TextView textViewPhone = findViewById(R.id.textViewPhone);
        TextView textViewEmail = findViewById(R.id.textViewEmail);

        btnOk.setOnClickListener(view -> System.exit(0));

        Intent intent = getIntent();

        String name = intent.getStringExtra("name_key");
        String gender = intent.getStringExtra("gender_key");
        String bdate = intent.getStringExtra("bdate_key");
        String email = intent.getStringExtra("email_key");
        String phone = intent.getStringExtra("phone_key");

        textViewName.setText(name);
        textViewGender.setText(gender);
        textViewBdate.setText(bdate);
        textViewEmail.setText(email);
        textViewPhone.setText(phone);
    }
}