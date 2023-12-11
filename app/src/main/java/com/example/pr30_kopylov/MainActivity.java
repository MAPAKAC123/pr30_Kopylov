package com.example.pr30_kopylov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStart(View v) {
        startService(new Intent(this, MyService.class).putExtra("time", 4));
        startService(new Intent(this, MyService.class).putExtra("time", 2));
        startService(new Intent(this, MyService.class).putExtra("time", 7));
    }
}