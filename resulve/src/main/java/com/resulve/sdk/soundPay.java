package com.resulve.sdk;

import android.content.Context;
import android.content.Intent;

public class soundPay {
    public void withReceive(Context c, String receiverID){
        Intent intent=new Intent(c,soundPayRecieve.class);
        intent.putExtra("receiverId",receiverID);
        c.startActivity(intent);
    }
}
