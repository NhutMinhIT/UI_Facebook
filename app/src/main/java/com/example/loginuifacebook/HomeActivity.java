package com.example.loginuifacebook;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Intent home = getIntent();
        String email = home.getStringExtra("email");
        ((TextView) findViewById(R.id.usernameHome)).setText("Welcome : " + email);
    }
}
