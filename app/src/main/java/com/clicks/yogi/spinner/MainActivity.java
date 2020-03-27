package com.clicks.yogi.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spin;
    String[] ipl = {"CSK","KKR","RCB","DC","MI","RR","KXI-PUNJAB","SH","DD"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    spin = findViewById(R.id.spinner);
    arrayAdapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,ipl);
    spin.setAdapter(arrayAdapter);

    }
}