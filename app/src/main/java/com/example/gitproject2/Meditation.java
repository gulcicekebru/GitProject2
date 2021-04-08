package com.example.gitproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Meditation extends AppCompatActivity {
 Button btn_back;
 Button btn_with_guide;
 Button btn_without_guide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
     //BACK BUTTON ILE HOME PAGE'E GERI DONUS
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meditation.this,home_pagee.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(withguide)
        btn_with_guide = findViewById(R.id.btn_with_guide);
        btn_with_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meditation.this,home_music_meditation.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(withoutguide)
        btn_without_guide = findViewById(R.id.btn_without_guide);
        btn_without_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Meditation.this,home_music_meditation.class);
                startActivity(intent);
            }
        });

    }
}