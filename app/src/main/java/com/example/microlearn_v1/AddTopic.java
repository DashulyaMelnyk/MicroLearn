package com.example.microlearn_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class AddTopic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_topic);
        String[] data = {"Management", "The influence of weather", "Lions in wild nature", "Innovations 2022 in Python", "History of beatles"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        // заголовок
        spinner.setPrompt("Title");
        // выделяем элемент
        spinner.setSelection(2);
        // устанавливаем обработчик нажатия
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // показываем позиция нажатого элемента
                Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void goToInterestingFacts(View v){
        Intent intent = new Intent(this, InterestingFacts.class);
        startActivity(intent);
    }

    public void goToProfile(View v){
        Intent intent2 = new Intent(this, Profile.class);
        startActivity(intent2);
    }
    public void goToArticles(View v){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }

    public void applyNewTopic(View view){

        Toast.makeText(this, "Topic will be added if possible", Toast.LENGTH_LONG).show();
        Intent intent3 = new Intent(this, MainActivity.class);
        startActivity(intent3);
    }
}