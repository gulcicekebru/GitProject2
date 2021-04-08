package com.example.gitproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explore_F extends AppCompatActivity {
Button btn_back;
Button btn_storm_f;
Button btn_classic_f;
Button btn_seashell_f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore__f);
        //BACK BUTTON ILE HOME PAGE'E GERI DONUS
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_F.this,explore_page.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(explore_music_focus(storm)
        btn_storm_f = findViewById(R.id.btn_storm_f);
        btn_storm_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_F.this,explore_music_focus.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(explore_music_focus(seashell)
        btn_seashell_f = findViewById(R.id.btn_seashell_f);
        btn_seashell_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_F.this,explore_music_focus.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(explore_music_focus(seashell)
        btn_classic_f = findViewById(R.id.btn_classic_f );
        btn_classic_f .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_F.this,explore_music_focus.class);
                startActivity(intent);
            }
        });
    }
}