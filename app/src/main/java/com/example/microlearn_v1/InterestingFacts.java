package com.example.microlearn_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.microlearn_v1.model.Fact;

import java.util.ArrayList;
import java.util.List;

public class InterestingFacts extends AppCompatActivity {

    List<Fact> factList = new ArrayList<>();
    String imageName;
    ImageView img;
    TextView textView;
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interesting_facts);
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayoutFacts);
        findViewById(R.id.drawer_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        factList.add(new Fact(1,"Studies show that if people adjust their facial expression to reflect an emotion, they actually begin to feel that emotion.", "https://www.merriam-webster.com/dictionary/adjustment#:~:text=Definition%20of%20adjustment,are%20adjusted%20one%20to%20another", "image_fact"));
        factList.add(new Fact(2,"Yacht was originally used by the Dutch navy as a small boat that was meant to catch pirates. Charles II used it as his own personal vessel, and since then the word has been applied to luxury boats and are often linked to important people.", "https://www.yachtworld.es/" ,"fact_2"));
        factList.add(new Fact(3, "The sun and the moon appear to be of the same size when observed from Earth, because the moon is 400 times smaller but 400 times closer at the same time.", "http://earthsky.org/space/coincidence-that-sun-and-moon-seem-same-size", "fact_3"));


        img = findViewById(R.id.imageFact);
        textView = findViewById(R.id.textFact);
        link = findViewById(R.id.linkFact);
        imageName = factList.get(0).getImgPath();
        img.setImageResource(R.drawable.image_fact);
        textView.setText(factList.get(0).getText());



    }


    public void goToArticles(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goToProfile(View v){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void showNextFact(View v){
        img.setImageResource(R.drawable.fact_2);
        textView.setText(factList.get(0).getText());
    }
}