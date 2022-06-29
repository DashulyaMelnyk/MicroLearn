package com.example.microlearn_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        DrawerLayout drawerLayout = findViewById(R.id.drawerLayoutProfile);
        findViewById(R.id.drawer_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    public void goToInterestingFacts(View v){
        Intent intent = new Intent(this, InterestingFacts.class);
        startActivity(intent);
    }

    public void goToArticles(View v){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }


}