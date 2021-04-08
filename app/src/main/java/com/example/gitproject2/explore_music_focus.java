package com.example.gitproject2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class explore_music_focus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_music_focus);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bnv_explore_f);//bottom navigation view id
        NavController navController = Navigation.findNavController(this, R.id.fem_f);//fragment id
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }
}