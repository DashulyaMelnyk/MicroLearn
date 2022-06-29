package com.example.microlearn_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimaryScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_screen);
    }

    public void toLogInPage(View view){
        Intent intent = new Intent(this, LogInPage.class);
        startActivity(intent);
    }
    public void toSignUpPage(View view){
        Intent intent = new Intent(this, SignUpPage.class);
        startActivity(intent);
    }
}