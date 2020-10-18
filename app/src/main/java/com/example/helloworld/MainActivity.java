package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.textView);

        Button redButton = findViewById(R.id.redBtn);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTextColor(Color.RED);
                redButton.setTextColor(Color.RED);
            }
        });

        Button greenButton = findViewById(R.id.greenBtn);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTextColor(Color.GREEN);
                greenButton.setTextColor(Color.GREEN);
            }
        });

        Button blueButton = findViewById(R.id.blueBtn);
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTextColor(Color.BLUE);
                blueButton.setTextColor(Color.BLUE);
            }
        });
    }
}