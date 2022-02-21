package com.example.modcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button modulusButton;
    private TextView dividendEditText;
    private TextView divisorEditText;
    private TextView remainderEditText;
    private TextView quotientEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modulusButton = findViewById(R.id.modulusButton);
        dividendEditText = findViewById(R.id.dividendEditText);
        divisorEditText = findViewById(R.id.divisorEditText);
        remainderEditText = findViewById(R.id.remainderEditText);
        quotientEditText = findViewById(R.id.quotientEditText);
        modulusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = dividendEditText.getText().toString();
                int dividend = Integer.parseInt(s1);
                String s2 = divisorEditText.getText().toString();
                int divisor = Integer.parseInt(s2);
                int remainder = dividend % divisor;
                int quotient = dividend / divisor;
                String remainderString = Integer.toString(remainder);
                String quotientString = Integer.toString(quotient);
                remainderEditText.setText("Remainder : "+remainderString);
                quotientEditText.setText("Quotient : "+quotientString);

            }
        });


    }
}