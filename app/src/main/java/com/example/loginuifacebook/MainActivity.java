package com.example.loginuifacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    private EditText emailLogin, passwordLogin;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin =(Button)findViewById(R.id.button);

        emailLogin =findViewById(R.id.email);
        passwordLogin = findViewById(R.id.password);

    }
            public void onLogin(View view){
                String email = emailLogin.getText().toString();
                String password = passwordLogin.getText().toString();

                if(email.equals("nhutminh") &&
                        password.equals("nhutminhadmin")) {
                    Intent home = new Intent(this, HomeActivity.class);
                    home.putExtra("email", email);
                    Toast.makeText(getApplicationContext(), "Logging...", Toast.LENGTH_LONG).show();
                    startActivity(home);

                }else{
                    Toast.makeText(this, "Wrong username or password!", Toast.LENGTH_SHORT).show();
                    ((EditText) findViewById(R.id.password)).setText("");
                    Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
        }
            }

