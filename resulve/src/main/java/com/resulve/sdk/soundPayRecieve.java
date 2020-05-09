package com.resulve.sdk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class soundPayRecieve extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  soundPay.withReceive(this,"");
        Intent i=getIntent();
        String s=i.getStringExtra("receiverId");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
