package com.example.gitproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explore_S extends AppCompatActivity {
Button btn_back;
Button btn_night_s;
Button btn_athmospheric_s;
Button btn_friends_s ;
Button btn_forest_s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore__s);
        //BACK BUTTON ILE HOME PAGE'E GERI DONUS
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_S.this,explore_page.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(explore_music_sleep(nightsound)
        btn_night_s = findViewById(R.id.btn_night_s );
        btn_night_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_S.this,explore_music_sleep.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(explore_music_sleep(atmospheric)
        btn_athmospheric_s = findViewById(R.id.btn_athmospheric_s );
        btn_athmospheric_s .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_S.this,explore_music_sleep.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(explore_music_sleep(forest)
        btn_forest_s = findViewById(R.id.btn_forest_s );
        btn_forest_s .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_S.this,explore_music_sleep.class);
                startActivity(intent);
            }
        });
        //MUZIK SAYFASINA YONLENDIRME(explore_music_sleep(our friends)
        btn_friends_s = findViewById(R.id.btn_friends_s );
        btn_friends_s .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Explore_S.this,explore_music_sleep.class);
                startActivity(intent);
            }
        });
    }
}