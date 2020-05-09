package com.resulve.sdk;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class soundPayRecieve extends AppCompatActivity {
    public static final int REQUEST_CODE = 0;
    mainListener mainListener;
    public soundPayRecieve(mainListener listener){
        this.mainListener=listener;
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  soundPay.withReceive(this,"");
        Intent i=getIntent();
        String s=i.getStringExtra("receiverId");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mainListener.onComplete("My Name is Alome Daniel...");
            }
        },1500);


    }

}
