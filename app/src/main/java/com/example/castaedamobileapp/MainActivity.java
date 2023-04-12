package com.example.castaedamobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button act1Button = findViewById(R.id.btnActvity1);
        Button act2Button = findViewById(R.id.btnActivity2);
        Button act3Button = findViewById(R.id.btnActivity3);
        Button sendSms = findViewById(R.id.btnSendSms);
        act1Button.setOnClickListener(this);
        act2Button.setOnClickListener(this);
        act3Button.setOnClickListener(this);
        sendSms.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnActvity1:
                Toast.makeText(MainActivity.this, "Activity 1 button is clicked!", Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnActivity2:
                Toast.makeText(MainActivity.this, "Activity 2 button is clicked!", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, MainActivity2_Menu.class);
                startActivity(intent2);

                break;
            case R.id.btnActivity3:
                Toast.makeText(MainActivity.this, "Activity 3 button is clicked!", Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnSendSms:
                Intent smsIntent = new Intent(this, Activity_SendSMSPage.class);
                startActivity(smsIntent);
                break;
        }
    }
}