package com.example.microlearn_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpPage extends AppCompatActivity {
    EditText name;
    EditText date;
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        name = findViewById(R.id.editTextFirstName);
        date = findViewById(R.id.editTextDate);
        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
    }

    public void signUpUser(View v){
        if(name.getText().toString().isEmpty() ||
                date.getText().toString().isEmpty() ||
                email.getText().toString().isEmpty()||
                password.getText().toString().isEmpty()){
            Toast.makeText(this, "Not all fields are filled", Toast.LENGTH_LONG).show();
        } else{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}