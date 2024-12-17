package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class menuu extends AppCompatActivity {
Button b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menuu);
        b4=(Button) findViewById(R.id.button0);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ag=new Intent(getApplicationContext(),addemployee.class);
                        startActivity(ag);
            }
        });
        b5=(Button) findViewById(R.id.button1);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ar=new Intent(getApplicationContext(),searchemployee.class);
                startActivity(ar);
            }
        });
        b6=(Button) findViewById(R.id.button2);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aw=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(aw);
            }
        });

    }
}