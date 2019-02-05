package com.hfad.ayazraja.intest;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class receiveMsg extends Activity {

    public static final String EXTRA_MESSAGE = "msg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_msg);
        Intent intent = getIntent();
        String msgText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView msgView = (TextView) findViewById(R.id.msg);
        msgView.setText(msgText);
    }

}
