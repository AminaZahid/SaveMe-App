package com.example.letmecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class O_AdminActions extends AppCompatActivity {


    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o__admin_actions);

        getSupportActionBar().setTitle("Organ Donation");

        firebaseAuth= FirebaseAuth.getInstance();
    }

    public void view_donars(View view) {
        Intent intent=new Intent(O_AdminActions.this,View_Donars.class);
        startActivity(intent);
    }

    public void admin_logout(View view) {

       firebaseAuth.signOut();
       Toast.makeText(O_AdminActions.this, "Admin SignOut Successful!!! And Signin Again", Toast.LENGTH_LONG).show();

      Intent intent=new Intent(O_AdminActions.this,Organ_don.class);
      startActivity(intent);

    }

    public void view_users(View view) {
        Intent intent=new Intent(O_AdminActions.this,View_Users.class);
        startActivity(intent);

    }
}