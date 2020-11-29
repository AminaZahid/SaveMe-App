package com.example.letmecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Blood_don extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_don);

        getSupportActionBar().setTitle("Blood Donation");
    }

    public void user_signup(View view) {
        Intent intent=new Intent(Blood_don.this,B_UserSignUp.class);
        startActivity(intent);

    }

    public void user_login(View view) {
        Intent intent=new Intent(Blood_don.this,B_UserLogin.class);
        startActivity(intent);

    }

    public void admin_login(View view) {
        Intent intent=new Intent(Blood_don.this,B_AdminLogin.class);
        startActivity(intent);

    }
}