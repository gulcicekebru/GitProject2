package com.example.gitproject2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home_music_meditation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_music_meditation);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bnv_h_m_m);//bottom navigation view id
        NavController navController = Navigation.findNavController(this, R.id.fhm_m);//fragment id
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}