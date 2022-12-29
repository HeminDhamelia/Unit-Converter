package com.example.converterhemin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText EnterNum;
    Button miles;
    Button meters;
    Button kilometers;
    Button centimeters;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        EnterNum = findViewById(R.id.editTextNumberDecimal);
        miles = findViewById(R.id.miles);
        meters = findViewById(R.id.meter);
        kilometers = findViewById(R.id.kilometer);
        centimeters = findViewById(R.id.centimeter);

        meters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float meters = (number * 1000);
                output.setText("values in meters : " + meters);
            }
        });
        centimeters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double centimeter = (number * 100);
                output.setText("values in centimeters : " + centimeter);
            }
        });
        kilometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double kilometers = (number / 1000);
                output.setText("values in kilometers : " + kilometers);
            }
        });
        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double miles = (number / 1.609);
                output.setText("values in meters : " + miles);
            }
        });
    }
}