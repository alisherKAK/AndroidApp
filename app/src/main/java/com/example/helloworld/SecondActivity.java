package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        int unclickableColor = 0x9FF44336;
        int clickableColor = 0xFFF44336;

        Button loginButton = findViewById(R.id.loginButton);
        TextInputEditText inputPhoneNumber = findViewById(R.id.inputPhoneNumber);
        TextInputEditText inputPIN = findViewById(R.id.inputPIN);

        loginButton.setBackgroundColor(unclickableColor);
        loginButton.setClickable(false);

        inputPhoneNumber.addTextChangedListener(new TextWatcher(){

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!inputPhoneNumber.getText().toString().isEmpty() && !inputPIN.getText().toString().isEmpty()){
                    loginButton.setClickable(true);
                    loginButton.setBackgroundColor(clickableColor);
                }
                else{
                    loginButton.setClickable(false);
                    loginButton.setBackgroundColor(unclickableColor);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        inputPIN.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!inputPhoneNumber.getText().toString().isEmpty() && !inputPIN.getText().toString().isEmpty()){
                    loginButton.setClickable(true);
                    loginButton.setBackgroundColor(clickableColor);
                }
                else{
                    loginButton.setClickable(false);
                    loginButton.setBackgroundColor(unclickableColor);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}