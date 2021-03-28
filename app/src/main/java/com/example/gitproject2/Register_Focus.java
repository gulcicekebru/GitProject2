package com.example.gitproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Register_Focus extends AppCompatActivity {

    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__focus);
    }

    public void Register(View v){

        EditText etUsername = (EditText) findViewById(R.id.etUserNameReg);
        EditText etMail = (EditText) findViewById(R.id.etMailReg);
        EditText etPassword = (EditText) findViewById(R.id.etPasswordReg);
        EditText etRepass = (EditText) findViewById(R.id.etRepassReg);
        TextView tvMessageReg = (TextView) findViewById(R.id.tvMessageRegister);
        RadioGroup rg1 = findViewById(R.id.rg_gender);
        RadioButton rg_male = findViewById(R.id.rbMale);
        RadioButton rg_female = findViewById(R.id.rbFemale);


        tvMessageReg.setVisibility(View.INVISIBLE);


        String usernameReg = etUsername.getText().toString().trim();
        String mailReg = etMail.getText().toString().trim();
        String passReg = etPassword.getText().toString().trim();
        String repassReg = etRepass.getText().toString().trim();



        if(usernameReg.equals("")){
            tvMessageReg.setText("Please Enter Your Username");
            tvMessageReg.setVisibility(View.VISIBLE);
            tvMessageReg.setTextColor(getResources().getColor(R.color.warningred));
            etUsername.requestFocus();
            return;
        }

        if(mailReg.equals("")){
            tvMessageReg.setText("Please Enter Your e-mail");
            tvMessageReg.setVisibility(View.VISIBLE);
            tvMessageReg.setTextColor(getResources().getColor(R.color.warningred));
            etMail.requestFocus();
            return;
        }

        if(!mailReg.contains("@") || !mailReg.contains(".com")){
            tvMessageReg.setText("Invalid Mail Adress");
            tvMessageReg.setVisibility(View.VISIBLE);
            tvMessageReg.setTextColor(getResources().getColor(R.color.warningred));
            etMail.requestFocus();
            return;
        }



        if(repassReg.equals("")){
            tvMessageReg.setText("Please Re-type Your Password");
            tvMessageReg.setVisibility(View.VISIBLE);
            tvMessageReg.setTextColor(getResources().getColor(R.color.warningred));
            etRepass.requestFocus();
            return;
        }

        if(!passReg.equals("") && !repassReg.equals("")){
            if(!passReg.equals(repassReg)){
                tvMessageReg.setText("Passwords do not match");
                tvMessageReg.setVisibility(View.VISIBLE);
                tvMessageReg.setTextColor(getResources().getColor(R.color.warningred));
                etPassword.requestFocus();
                return;}
        }

        Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");


        if (passReg.length() < 8) {
            tvMessageReg.setText("Password Lenght Must Have At Least 8 Character");
            tvMessageReg.setVisibility(View.VISIBLE);
            tvMessageReg.setTextColor(getResources().getColor(R.color.warningred));
            etPassword.requestFocus();
            return;
        }
        if (!specailCharPatten.matcher(passReg).find()) {
            tvMessageReg.setText("Password Must Have At Least One Special Character");
            tvMessageReg.setVisibility(View.VISIBLE);
            tvMessageReg.setTextColor(getResources().getColor(R.color.warningred));
            etPassword.requestFocus();
            return;
        }
        if (!UpperCasePatten.matcher(passReg).find()) {
            tvMessageReg.setText("Password Must Have At Least One Uppercase Character");
            tvMessageReg.setVisibility(View.VISIBLE);
            tvMessageReg.setTextColor(getResources().getColor(R.color.warningred));
            etPassword.requestFocus();
            return;
        }
        if (!lowerCasePatten.matcher(repassReg).find()) {
            tvMessageReg.setText("Password Must Have At Least One Lowercase Character");
            tvMessageReg.setVisibility(View.VISIBLE);
            tvMessageReg.setTextColor(getResources().getColor(R.color.warningred));
            etPassword.requestFocus();
            return;
        }
        if (!digitCasePatten.matcher(repassReg).find()) {
            tvMessageReg.setText("Password Must Have At Least One Digit Character");
            tvMessageReg.setVisibility(View.VISIBLE);
            tvMessageReg.setTextColor(getResources().getColor(R.color.warningred));
            etPassword.requestFocus();
            return;
        }

        if(-1 == rg1.getCheckedRadioButtonId()){
            tvMessageReg.setText("Please Select a Gender Option");
            tvMessageReg.setVisibility(View.VISIBLE);
            tvMessageReg.setTextColor(getResources().getColor(R.color.warningred));
            return;
        }
        else{
            if(rg1.getCheckedRadioButtonId() == R.id.rbFemale){
                gender="Female";
            }
            else if(rg1.getCheckedRadioButtonId() == R.id.rbMale){
                gender = "Male";
            }
            else{
                gender="Others";
            }
        }

        if(tvMessageReg.getVisibility() == View.INVISIBLE){
            tvMessageReg.setText("Register Is Successfull");
            tvMessageReg.setVisibility(View.VISIBLE);
            tvMessageReg.setTextColor(getResources().getColor(R.color.success));
            etRepass.requestFocus();
            return;
        }

        return;







    }
}