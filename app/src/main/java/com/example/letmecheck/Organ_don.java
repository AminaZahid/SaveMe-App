package com.example.letmecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Organ_don extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organ_don);

        getSupportActionBar().setTitle("Organ Donation");
    }

    public void user_signup(View view) {
        Intent intent=new Intent(Organ_don.this,O_UserSignUp.class);
        startActivity(intent);
    }

    public void user_login(View view) {
        Intent intent=new Intent(Organ_don.this,O_UserLogin.class);
        startActivity(intent);

    }

    public void admin_login(View view) {
        Intent intent=new Intent(Organ_don.this,O_AdminLogin.class);
        startActivity(intent);

    }
}