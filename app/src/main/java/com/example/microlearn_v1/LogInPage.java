package com.example.microlearn_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class LogInPage extends AppCompatActivity {
    EditText editEmail;
    EditText editPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        editEmail = findViewById(R.id.editTextTextPersonName);
        editPassword = findViewById(R.id.editTextTextPassword);


    }

    public void loginUser(View view){
        if(editEmail.getText().toString().equals("a") && editPassword.getText().toString().equals("a")) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Wrong email or password", Toast.LENGTH_LONG).show();
        }
    }

    public void goBack(View view){
        Intent intent = new Intent(this, PrimaryScreen.class);
        startActivity(intent);
    }
}