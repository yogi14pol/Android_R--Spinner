package com.clicks.yogi.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
/*
            // Type 1: By this code you can retrieve the selected item from the dropdown item...
            Toast.makeText(MainActivity.this, "Team: "+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
*/
                // Type 2:
                switch (position) {

                    case 0:
                        Toast.makeText(MainActivity.this, "Hey CSK", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Hey KKR", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Hey RCB", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Hey DC", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "Hey MI", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "Hey RR", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(MainActivity.this, "Hey KXI-PUNJAB", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(MainActivity.this, "Hey SH", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(MainActivity.this, "Hey DD", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Something went wrong...", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // This method is called whenever item is removed from the list...
            }
        });
    
    }
}