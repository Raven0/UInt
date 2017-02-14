package com.raven13.dicodingacademy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class intentThird extends AppCompatActivity {

    public static String KEY_DATA = "data";
    private String receiveData = "null";
    private TextView txtDat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_third);

        txtDat = (TextView)findViewById(R.id.txt_data);
        receiveData = getIntent().getStringExtra(KEY_DATA);
        txtDat.setText(receiveData);

    }
}
