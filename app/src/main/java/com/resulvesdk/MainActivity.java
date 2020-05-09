package com.resulvesdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.resulve.sdk.listerners;
import com.resulve.sdk.mainListener;
import com.resulve.sdk.soundPay;

public class MainActivity extends AppCompatActivity implements listerners,mainListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new soundPay(this).withReceive(this,"theNameOfAlomeDanielISAlomeOchoche");
    }

    @Override
    public void onComplete(String message) {
        Toast.makeText(this, "Data Completed", Toast.LENGTH_SHORT).show();
    }
}
