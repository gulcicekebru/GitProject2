package com.example.gitproject2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home_Page extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView_home_page);
        NavController navController = Navigation.findNavController(this, R.id.bnv_h_m_f);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }




}

