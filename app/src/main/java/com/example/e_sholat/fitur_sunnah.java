package com.example.e_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class fitur_sunnah extends AppCompatActivity {

    RelativeLayout h;
    RelativeLayout i;
    RelativeLayout j;
    RelativeLayout k;
    RelativeLayout l;
    RelativeLayout m;
    RelativeLayout n;
    RelativeLayout o;
    RelativeLayout p;
    RelativeLayout q;
    RelativeLayout r;
    RelativeLayout s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitur_sunnah);


        h = (RelativeLayout) findViewById(R.id.tahajud);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),tahajud.class);
                startActivity(intent);
            }
        });

        i = (RelativeLayout) findViewById(R.id.dhuha);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),dhuha.class);
                startActivity(intent);
            }
        });

        j = (RelativeLayout) findViewById(R.id.istikharoh);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),istikharoh.class);
                startActivity(intent);
            }
        });

        k = (RelativeLayout) findViewById(R.id.tasbih);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),tasbih.class);
                startActivity(intent);
            }
        });

        l = (RelativeLayout) findViewById(R.id.gerhana);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),gerhana.class);
                startActivity(intent);
            }
        });

        m = (RelativeLayout) findViewById(R.id.eid);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),menu_idul.class);
                startActivity(intent);
            }
        });


        n = (RelativeLayout) findViewById(R.id.taubat);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),taubat.class);
                startActivity(intent);
            }
        });


        o = (RelativeLayout) findViewById(R.id.rawatib);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),rawatib.class);
                startActivity(intent);
            }
        });


        p = (RelativeLayout) findViewById(R.id.wudhu);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),wudhu.class);
                startActivity(intent);
            }
        });


        q = (RelativeLayout) findViewById(R.id.istisqo);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),istisqo.class);
                startActivity(intent);
            }
        });

        r = (RelativeLayout) findViewById(R.id.tarawih);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),tarawih.class);
                startActivity(intent);
            }
        });


        s = (RelativeLayout) findViewById(R.id.hajat);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),hajat.class);
                startActivity(intent);
            }
        });

    }
}
