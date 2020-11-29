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

public class B_AdminLogin extends AppCompatActivity {

    EditText txtEmail,txtPassword;
    Button btn_login;
    private FirebaseAuth firebaseAuth;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b__admin_login);


        getSupportActionBar().setTitle("Blood Donation");

        txtEmail=(EditText) findViewById(R.id.txt_email);
        txtPassword =(EditText)findViewById(R.id.txt_password);
        btn_login=(Button)findViewById(R.id.buttonLogin);
        txt=(TextView)findViewById(R.id.textView);
        firebaseAuth=FirebaseAuth.getInstance();

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String email = txtEmail.getText().toString().trim();
                String password = txtPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(B_AdminLogin.this, "Please Enter  Email", Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(B_AdminLogin.this, "Please Enter  Password", Toast.LENGTH_LONG).show();
                    return;
                }
                if (password.length() < 6) {
                    Toast.makeText(B_AdminLogin.this, "Too short password", Toast.LENGTH_LONG).show();

                }

                firebaseAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(B_AdminLogin.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(B_AdminLogin.this, "Login Successful !!!", Toast.LENGTH_LONG).show();


                               Intent intent=new Intent(B_AdminLogin.this,B_AdminActions.class);
                              startActivity(intent);


                                } else {
                                    Toast.makeText(B_AdminLogin.this, "Login Failed", Toast.LENGTH_LONG).show();

                                }

                            }
                        });

            }
        });
    }

}