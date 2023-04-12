package com.example.castaedamobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_SendSMSPage extends AppCompatActivity {
    Button send;
    Button clear;
    EditText phoneNum;
    EditText message;
    String phoneNo;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_smspage);

        send = findViewById(R.id.btnSendSMS);
        clear = findViewById(R.id.btnClearSMS);
        phoneNum = findViewById(R.id.editTextPhoneNum);
        message = findViewById(R.id.editTextMessage);

        send.setOnClickListener(view -> {
            phoneNo = phoneNum.getText().toString();
            msg = message.getText().toString();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", phoneNo, null));
            intent.putExtra("sms_body", (CharSequence) message);
            startActivity(intent);

            Toast.makeText(this, "SMS Sent", Toast.LENGTH_SHORT).show();
        });
    }
}