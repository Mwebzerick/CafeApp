package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.food:
                Intent intent = new Intent(this, three.class);
                startActivity(intent);
                break;
            case R.id.email:
                Toast.makeText(this, "Option Unavailable", Toast.LENGTH_SHORT).show();
                Intent in = new Intent(this,SendEmail.class);
                startActivity(in);
                break;
            case R.id.sett:
                Toast.makeText(this, "Option Unavailable", Toast.LENGTH_SHORT).show();
                break;
            case R.id.frag:
                Intent intent1 = new Intent(this, fragment_home.class);
                startActivity(intent1);
                break;
            default:
                Toast.makeText(this, "Option Unavailable", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
