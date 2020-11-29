package com.example.letmecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().setTitle("Home");




    }

    public void organ_don(View view) {

        Intent intent=new Intent(Home.this,Organ_don.class);
        startActivity(intent);
    }


    public void blood_don(View view) {

        Intent intent=new Intent(Home.this,Blood_don.class);
        startActivity(intent);

    }
}