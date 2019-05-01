package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Broadcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
    }
    public void sendMsg(View v){
        String uniqueActionString="com.androidbook.intents.testbc";
        Intent broadcastIntent= new Intent(uniqueActionString);
        broadcastIntent.putExtra("message","CafeArk welcomes you");
        sendBroadcast(broadcastIntent);

    }
}
