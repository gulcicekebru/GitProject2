package com.example.gitproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sleep extends AppCompatActivity {
 Button btn_back;
 Button btn_deep_sleep;
 Button btn_light_sleep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        //BACK BUTTON ILE HOME PAGE'E GERI DONUS
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sleep.this,home_pagee.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(home_music_sleep(deepsleep)
        btn_deep_sleep = findViewById(R.id.btn_deep_sleep );
        btn_deep_sleep .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sleep.this,home_music_sleep.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(home_music_sleep(lightsleep)
        btn_light_sleep= findViewById(R.id.btn_light_sleep );
        btn_light_sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sleep.this,home_music_sleep.class);
                startActivity(intent);
            }
        });
    }
}