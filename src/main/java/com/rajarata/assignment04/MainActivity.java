package com.rajarata.assignment04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView answer;
    Button adding;
    Button substracting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1=findViewById(R.id.textView2);
        num2=findViewById(R.id.textView4);
        answer=findViewById(R.id.textView6);
        adding=findViewById(R.id.button);
        substracting=findViewById(R.id.button2);

        adding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 + number2;
                //answer.setText(String.valueOf(sum));

                answer.setText(Double.toString(sum));


            }
        });

        substracting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double substract = number1 - number2;
                answer.setText(Double.toString(substract));
                //answer.setText(String.valueOf(substract));
            }
        });

    }
}