package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Intent intent = getIntent();
        String text = intent.getStringExtra("Message");

        if(text != null) {
            TextView textView = findViewById(R.id.textFromOtherActivity);
            textView.setText(text);
        }

        Button aActivityButton = findViewById(R.id.activityAButton);
        aActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BActivity.this, MainActivity.class);
                intent.putExtra("Message", "Привет из активити B");
                startActivity(intent);
            }
        });

        Button cActivityButton = findViewById(R.id.activityCButton);
        cActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BActivity.this, CActivity.class);
                intent.putExtra("Message", "Привет из активити B");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("App", "Ждем твоего возвращения в B");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("App", "С возвращением в B");
    }
}