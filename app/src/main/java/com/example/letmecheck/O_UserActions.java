package com.example.letmecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class O_UserActions extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o__user_actions);
        getSupportActionBar().setTitle("Organ Donation");

        firebaseAuth= FirebaseAuth.getInstance();

    }

    public void donate_organ(View view) {
        Intent intent=new Intent(O_UserActions.this,Donate_Organ.class);
        startActivity(intent);
  }

    public void user_logout(View view) {

        firebaseAuth.signOut();
        Toast.makeText(O_UserActions.this, "SignOut Successful!!! And Signin Again", Toast.LENGTH_LONG).show();

        Intent intent=new Intent(O_UserActions.this,Organ_don.class);
        startActivity(intent);

     }

    public void create_profile(View view) {
        Intent intent=new Intent(O_UserActions.this,Create_Profile.class);
        startActivity(intent);
    }
}