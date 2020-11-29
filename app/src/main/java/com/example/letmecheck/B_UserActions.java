package com.example.letmecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class B_UserActions extends AppCompatActivity {

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b__user_actions);

        firebaseAuth= FirebaseAuth.getInstance();

        getSupportActionBar().setTitle("Blood Donation");
    }

    public void donate_blood(View view) {

        Intent intent=new Intent(B_UserActions.this,Donate_Blood.class);
        startActivity(intent);

    }

    public void create_profile(View view) {

        Intent intent=new Intent(B_UserActions.this,B_CreateProfile.class);
        startActivity(intent);

    }

    public void user_logout(View view) {
      firebaseAuth.signOut();
          Toast.makeText(B_UserActions.this, "SignOut Successful!!! And Signin Again", Toast.LENGTH_LONG).show();

        Intent intent=new Intent(B_UserActions.this,Blood_don.class);
        startActivity(intent);

    }
}