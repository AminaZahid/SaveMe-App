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

public class Donate_Organ extends AppCompatActivity {

    EditText txt_name,txt_age,txt_blood,txt_mobile,txt_city,txt_country,txt_part;
    Button add;
    FirebaseDatabase database;
    DatabaseReference ref;

    String myCurrentDateTime = DateFormat.getDateTimeInstance()
            .format(Calendar.getInstance().getTime());

    Organ organ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate__organ);

        getSupportActionBar().setTitle("Organ Donation");



        txt_name=(EditText) findViewById(R.id.name);
        txt_age=(EditText)findViewById(R.id.age);
        txt_blood=(EditText)findViewById(R.id.blood);
        txt_city=(EditText)findViewById(R.id.city);
        txt_country=(EditText)findViewById(R.id.country);
        txt_mobile=(EditText)findViewById(R.id.mobile);
        txt_part=(EditText)findViewById(R.id.part);
        add=(Button)findViewById(R.id.insert);
        organ=new Organ();
        database=FirebaseDatabase.getInstance();
        ref=database.getReference("Organ");

    }

    private void getValues(){
        organ.setName((txt_name).getText().toString());
        organ.setAge((txt_age).getText().toString());
        organ.setBlood((txt_blood).getText().toString());
        organ.setMobile((txt_mobile).getText().toString());
        organ.setCity((txt_city).getText().toString());
        organ.setCountry((txt_country).getText().toString());
        organ.setPart((txt_part).getText().toString());
    }

    public void insert(View view) {
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                getValues();
                ref.child(myCurrentDateTime).setValue(organ);

                Toast.makeText(Donate_Organ.this,"Data inserted successfully!!!",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


            }
        });

    }
}