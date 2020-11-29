package com.example.letmecheck;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.util.Calendar;

public class B_CreateProfile extends AppCompatActivity {


    EditText txt_name,txt_age,txt_email,txt_mobile,txt_city,txt_country;
    Button add;
    FirebaseDatabase database;
    DatabaseReference ref;

    String myCurrentDateTime = DateFormat.getDateTimeInstance()
            .format(Calendar.getInstance().getTime());

    BUsers bUsers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b__create_profile);

        getSupportActionBar().setTitle("Blood Donation");



        txt_name=(EditText) findViewById(R.id.name);
        txt_age=(EditText)findViewById(R.id.age);
        txt_email=(EditText)findViewById(R.id.email);
        txt_city=(EditText)findViewById(R.id.city);
        txt_country=(EditText)findViewById(R.id.country);
        txt_mobile=(EditText)findViewById(R.id.mobile);

        add=(Button)findViewById(R.id.insert);
        bUsers=new BUsers();
        database=FirebaseDatabase.getInstance();
        ref=database.getReference("BUsers");

    }

    private void getValues(){
        bUsers.setName((txt_name).getText().toString());
        bUsers.setAge((txt_age).getText().toString());
        bUsers.setEmail((txt_email.getText()).toString());
        bUsers.setMobile((txt_mobile).getText().toString());
        bUsers.setCity((txt_city).getText().toString());
        bUsers.setCountry((txt_country).getText().toString());
        //organ.setPart((txt_part).getText().toString());
    }

    public void insert(View view) {
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                getValues();
                ref.child(myCurrentDateTime).setValue(bUsers);

                Toast.makeText(B_CreateProfile.this,"Data inserted successfully!!!",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


            }
        });

    }
}