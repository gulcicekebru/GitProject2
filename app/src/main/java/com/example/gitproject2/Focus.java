package com.example.gitproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Focus extends AppCompatActivity {
 Button btn_back;
 Button btn_deep_work;
 Button btn_creative_work;
 Button btn_light_work;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_focus);
        //BACK BUTTON ILE HOME PAGE'E GERI DONUS
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Focus.this,home_pagee.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(home_music_focus(deepwork)
        btn_deep_work = findViewById(R.id.btn_deep_work);
        btn_deep_work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Focus.this,home_music_focus.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(home_music_focus(light work)
        btn_light_work = findViewById(R.id.btn_light_work);
        btn_light_work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Focus.this,home_music_focus.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(home_music_focus(creative work)
        btn_creative_work = findViewById(R.id.btn_creative_work);
        btn_creative_work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Focus.this,home_music_focus.class);
                startActivity(intent);
            }
        });
    }

}