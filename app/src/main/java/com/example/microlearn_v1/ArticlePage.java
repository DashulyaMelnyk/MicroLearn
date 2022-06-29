package com.example.microlearn_v1;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ArticlePage extends AppCompatActivity {

    TextView textName;
    TextView textArticle;
    ImageView buttonBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_page);
        textArticle = findViewById(R.id.main_article_text);
        textName = findViewById(R.id.title_theme);
        textArticle.setMovementMethod(new ScrollingMovementMethod());
        buttonBack = findViewById(R.id.button_back);
        textName.setText(getIntent().getStringExtra("name_theme"));
        textArticle.setText(getIntent().getStringExtra("text_theme"));


    }

    public void goBackToArticles(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}