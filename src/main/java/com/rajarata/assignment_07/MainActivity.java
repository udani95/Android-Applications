package com.rajarata.assignment_07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2,button3,button4,button5,button6,button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbookActivity();
            }
        });

        /*button1 = (Button) findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmemberActivity();
            }
        });*/
    }
    public void openbookActivity(){
        Intent intent = new Intent(this, Bookdetails.class);
        startActivity(intent);
    }

    /*public void openmemberActivity(){
        Intent intent = new Intent(this, Memberdetails.class);
        startActivity(intent);
    }*/
}