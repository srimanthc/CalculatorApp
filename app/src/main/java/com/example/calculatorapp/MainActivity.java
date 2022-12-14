package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 + num2;

            numberSumTV.setText("" + sum);
        }catch(Exception e){
            numberSumTV.setText("Please enter a number");
        }
    }
    public void findSub(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
    try {
        int num1 = Integer.parseInt((number1ET.getText().toString()));
        int num2 = Integer.parseInt((number2ET.getText().toString()));
        int sum = num1 - num2;

        numberSumTV.setText("" + sum);
    }catch(Exception e){
        numberSumTV.setText("Please enter a number");
    }
    }
    public void findMult(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1 * num2;

            numberSumTV.setText("" + sum);
        }catch(Exception e){
            numberSumTV.setText("Please enter a number");
        }
    }
    public void findDiv(View view) {
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        try {
            int num1 = Integer.parseInt((number1ET.getText().toString()));
            int num2 = Integer.parseInt((number2ET.getText().toString()));
            int sum = num1/num2;

            numberSumTV.setText("" + sum);
        }catch(Exception e){
            numberSumTV.setText("Please enter a number");
        }
    }
}