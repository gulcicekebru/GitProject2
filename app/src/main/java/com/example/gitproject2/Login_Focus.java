package com.example.gitproject2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_Focus extends AppCompatActivity {

    Button butRegister;
    Button butLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__focus);

        butRegister = findViewById(R.id.btn_register);
        butRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_Focus.this,Register_Focus.class);
                startActivity(intent);
            }

        });
        butLogin = findViewById(R.id.btn_login);
        butLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_Focus.this,Home_Page.class);
                startActivity(intent);
            }
        });

    }

    public void LogMeIn(View v){

        EditText etUsernameMail = (EditText) findViewById(R.id.etEmail);
        EditText etUserPass = (EditText) findViewById(R.id.etPass);
        TextView tvMessage = (TextView) findViewById(R.id.tvMessage);

        String username_mail = etUsernameMail.getText().toString().trim();
        String user_password = etUserPass.getText().toString().trim();

        if(username_mail.equals("")){
            tvMessage.setText("Please Enter Your e-mail or Username");
            tvMessage.setVisibility(View.VISIBLE);
            tvMessage.setTextColor(getResources().getColor(R.color.warningred));
            etUsernameMail.requestFocus();
            return;
        }

        if(!username_mail.contains("@") || !username_mail.contains(".com")){
            tvMessage.setText("Invalid Mail Adress");
            tvMessage.setVisibility(View.VISIBLE);
            tvMessage.setTextColor(getResources().getColor(R.color.warningred));
            etUsernameMail.requestFocus();
            return;
        }

        if(user_password.equals("")){
            tvMessage.setText("Please Enter Your Password");
            tvMessage.setVisibility(View.VISIBLE);
            tvMessage.setTextColor(getResources().getColor(R.color.warningred));
            etUserPass.requestFocus();
            return;
        }

        if(username_mail.equals("a@gmail.com") && user_password.equals("4"))
        {
            tvMessage.setText("Succesfull!");
            tvMessage.setVisibility(View.VISIBLE);
            tvMessage.setTextColor(getResources().getColor(R.color.success));
            return;
        }
        else {
            tvMessage.setText("Invalid User");
            tvMessage.setVisibility(View.VISIBLE);
            tvMessage.setTextColor(getResources().getColor(R.color.warningred));
        }
        return;
    }
}