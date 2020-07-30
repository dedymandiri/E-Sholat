package com.example.e_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class fitur_fardhu extends AppCompatActivity {
    RelativeLayout a;
    RelativeLayout b;
    RelativeLayout c;
    RelativeLayout d;
    RelativeLayout e;
    RelativeLayout f;
    RelativeLayout g;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitur_fardhu);


        a = (RelativeLayout) findViewById(R.id.subuh);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),subuh.class);
                startActivity(intent);
            }
        });


        b = (RelativeLayout) findViewById(R.id.dhuhur);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),dhuhur.class);
                startActivity(intent);
            }
        });


        c = (RelativeLayout) findViewById(R.id.ashar);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ashar.class);
                startActivity(intent);
            }
        });


        d = (RelativeLayout) findViewById(R.id.maghrib);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),maghrib.class);
                startActivity(intent);
            }
        });


        e = (RelativeLayout) findViewById(R.id.isya);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),isya.class);
                startActivity(intent);
            }
        });






    }
}
