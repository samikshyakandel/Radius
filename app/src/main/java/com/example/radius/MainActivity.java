package com.example.radius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextRadius;
    private TextView textViewArea;
    private TextView textViewCircumference;
    private Button buttonCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextRadius = findViewById(R.id.editTextRadius);
        textViewArea = findViewById(R.id.textViewArea);
        textViewCircumference = findViewById(R.id.textViewCircumference);
        buttonCalculate = findViewById(R.id.buttonCalculate);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAndDisplay();
            }
        });
    }

    private void calculateAndDisplay() {
        String radiusStr = editTextRadius.getText().toString().trim();

        if (!radiusStr.isEmpty()) {
            double radius = Double.parseDouble(radiusStr);
            double area = Math.PI * Math.pow(radius, 2);
            double circumference = 2 * Math.PI * radius;

            textViewArea.setText("Area: " + area);
            textViewCircumference.setText("Circumference: " + circumference);
        } else {
            textViewArea.setText("Area: ");
            textViewCircumference.setText("Circumference: ");
        }

    }
}