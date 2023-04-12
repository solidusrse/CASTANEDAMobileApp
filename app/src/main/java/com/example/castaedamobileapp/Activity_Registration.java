package com.example.castaedamobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Activity_Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        EditText firstname = findViewById(R.id.fieldFirstName);
        EditText lastname = findViewById(R.id.fieldLastName);
        EditText bdate = findViewById(R.id.fieldBirthdate);
        EditText phone = findViewById(R.id.fieldPhone);
        EditText email = findViewById(R.id.fieldEmail);
        RadioButton radMale = findViewById(R.id.choiceMale);
        RadioButton radFem = findViewById(R.id.choiceFemale);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(view -> {
            String fname = firstname.getText().toString();
            String lname = lastname.getText().toString();
            String name = fname.concat(" ").concat(lname);
            String gender;
            if(radMale.isSelected())
                gender = "Female";
            else
                gender = "Male";
            String birthdate = bdate.getText().toString();
            String phoneNum = phone.getText().toString();
            String emailAdd = email.getText().toString();

            Intent intent = new Intent(getApplicationContext(), Activity_Display.class);
            intent.putExtra("name_key", name);
            intent.putExtra("gender_key", gender);
            intent.putExtra("bdate_key", birthdate);
            intent.putExtra("phone_key", phoneNum);
            intent.putExtra("email_key", emailAdd);
            startActivity(intent);
        });

        btnClear.setOnClickListener(view -> {
            firstname.setText("");
            lastname.setText("");
            bdate.setText("");
            phone.setText("");
            email.setText("");
        });
    }
}