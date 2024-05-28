package com.example.arendainwagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView result;
    Button calculate;
    Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.txtNum1);
        num2 = findViewById(R.id.txtNum2);
        result = findViewById(R.id.txtResult);
        calculate = findViewById(R.id.btnCompute);
        clear = findViewById(R.id.btnClear);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double product = number1 * number2;
                result.setText(String.valueOf(product));

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText(" ");
                num2.setText(" ");
                result.setText("00.00");
            }
        });
    }
}