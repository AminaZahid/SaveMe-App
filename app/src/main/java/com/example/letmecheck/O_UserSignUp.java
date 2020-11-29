package com.example.letmecheck;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class O_UserSignUp extends AppCompatActivity {

    EditText txtEmail,txtPassword;
    Button btn_register;
    private FirebaseAuth firebaseAuth;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o__user_sign_up);
        getSupportActionBar().setTitle("Organ Donation");

        txtEmail=(EditText) findViewById(R.id.txt_email);
        txtPassword =(EditText)findViewById(R.id.txt_password);
        btn_register=(Button)findViewById(R.id.buttonRegister);
        txt=(TextView)findViewById(R.id.textView);
        firebaseAuth=FirebaseAuth.getInstance();




        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = txtEmail.getText().toString().trim();
                String password = txtPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(O_UserSignUp.this, "Please Enter  Email", Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(O_UserSignUp.this, "Please Enter  Password", Toast.LENGTH_LONG).show();
                    return;
                }


                if (password.length() < 6) {
                    Toast.makeText(O_UserSignUp.this, "Password is too short", Toast.LENGTH_LONG).show();

                }

                firebaseAuth.createUserWithEmailAndPassword(email,password)
                        .addOnCompleteListener(O_UserSignUp.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    startActivity(new Intent(getApplicationContext(), O_UserLogin.class));
                                    Toast.makeText(O_UserSignUp.this, "Registration Done Successfully..!!!", Toast.LENGTH_LONG).show();
                                } else {
                                    Toast.makeText(O_UserSignUp.this, "Sorry!Registration failed", Toast.LENGTH_LONG).show();
                                }


                            }
                        });
            }

        });




    }
}