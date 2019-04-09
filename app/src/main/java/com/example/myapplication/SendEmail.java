package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendEmail extends AppCompatActivity {
    Button send;
    EditText sub,mes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);
        sub = findViewById(R.id.sub);
        mes = findViewById(R.id.message);
        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subject = sub.getText().toString();
                String message = mes.getText().toString();

                Intent sendEmail = new Intent(Intent.ACTION_SEND);
                sendEmail.putExtra(Intent.EXTRA_SUBJECT,subject);
                sendEmail.putExtra(Intent.EXTRA_TEXT,message);
                sendEmail.setType("message/rfc822");
                startActivity(Intent.createChooser(sendEmail,"Send Email"));

            }
        });
    }
}
