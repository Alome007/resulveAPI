package com.resulvesdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.resulve.sdk.soundPay;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new soundPay().withReceive(this,"theNameOfAlomeDanielISAlomeOchoche");
    }
}
