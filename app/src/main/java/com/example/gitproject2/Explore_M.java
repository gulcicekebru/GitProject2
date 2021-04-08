package com.example.gitproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explore_M extends AppCompatActivity {
Button btn_back;
Button btn_m_m;
Button btn_z_m;
Button btn_c_m;
Button btn_v_m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore__m);
        //BACK BUTTON ILE HOME PAGE'E GERI DONUS
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_M.this,explore_page.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(explore_music_meditation(metta)
        btn_m_m  = findViewById(R.id.btn_m_m );
        btn_m_m .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_M.this,explore_music_meditation.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(explore_music_meditation(zazen)
        btn_z_m  = findViewById(R.id.btn_z_m );
        btn_z_m .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_M.this,explore_music_meditation.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(explore_music_meditation(chakra)
        btn_c_m  = findViewById(R.id.btn_c_m );
        btn_c_m .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_M.this,explore_music_meditation.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(explore_music_meditation(v)
        btn_v_m  = findViewById(R.id.btn_v_m );
        btn_v_m .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_M.this,explore_music_meditation.class);
                startActivity(intent);
            }
        });
    }
}