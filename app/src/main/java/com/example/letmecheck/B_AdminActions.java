package com.example.letmecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class B_AdminActions extends AppCompatActivity {

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b__admin_actions);

        getSupportActionBar().setTitle("Blood Donation");

        firebaseAuth= FirebaseAuth.getInstance();

    }

    public void admin_logout(View view) {

        firebaseAuth.signOut();
        Toast.makeText(B_AdminActions.this, "Admin SignOut Successful!!! And Signin Again", Toast.LENGTH_LONG).show();
        Intent intent=new Intent(B_AdminActions.this,Blood_don.class);
        startActivity(intent);

    }

    public void view_users(View view) {

        Intent intent=new Intent(B_AdminActions.this,B_ViewUsers.class);
        startActivity(intent);

    }

    public void view_donars(View view) {

        Intent intent=new Intent(B_AdminActions.this,B_ViewDonars.class);
        startActivity(intent);


    }
}