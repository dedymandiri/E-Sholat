package com.example.e_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class menu_idul extends AppCompatActivity {
    RelativeLayout e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_idul);


        e = (RelativeLayout) findViewById(R.id.idul_fitri);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),idul_fitri.class);
                startActivity(intent);
            }
        });

        e = (RelativeLayout) findViewById(R.id.idul_adha);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),idul_adha.class);
                startActivity(intent);
            }
        });

    }
}
