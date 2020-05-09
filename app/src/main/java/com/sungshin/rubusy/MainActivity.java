package com.sungshin.rubusy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_detail); //activity_main
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
    }
}
