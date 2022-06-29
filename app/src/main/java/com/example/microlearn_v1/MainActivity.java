package com.example.microlearn_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.microlearn_v1.adapters.DailyArticleAdapter;
import com.example.microlearn_v1.model.DailyArticle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView articlesRecycler;
    DailyArticleAdapter dailyArticleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<DailyArticle> articleList = new ArrayList<>();
        articleList.add(new DailyArticle(1,"Машинное обучение", "Машинное обучение — это наука " +
                "о том, как заставить ИИ учиться и действовать как человек, а также сделать так, чтобы он сам постоянно улучшал свое обучение и ..."));
        articleList.add(new DailyArticle(2,"Экономичный менеджмент", "Финансовый менеджмент — система управления денежными потоками" +
                " организации с целью оптимизации рисков в соответствии с критериями и предпочтениями руководящих субъектов в..."));
        articleList.add(new DailyArticle(3, "Искусство", "Обычно под искусством подразумевают образное осмысление действительности;" +
                " процесс и итог выражения внутреннего и внешнего (по отношению к творцу) мира."));
        articleList.add(new DailyArticle(4,"Машинное обучение", "Машинное обучение — это наука " +
                "о том, как заставить ИИ учиться и действовать как человек, а также сделать так, чтобы он сам постоянно улучшал свое обучение и ..."));
        articleList.add(new DailyArticle(5,"Экономичный менеджмент", "Финансовый менеджмент — система управления денежными потоками" +
                " организации с целью оптимизации рисков в соответствии с критериями и предпочтениями руководящих субъектов в..."));
        articleList.add(new DailyArticle(6, "Искусство", "Обычно под искусством подразумевают образное осмысление действительности;" +
                " процесс и итог выражения внутреннего и внешнего (по отношению к творцу) мира."));

        setDailyArticleRecycler(articleList);
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayoutMain);
        findViewById(R.id.drawer_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

    }

    private void setDailyArticleRecycler(List<DailyArticle> articleList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        articlesRecycler = findViewById(R.id.articlesRecycler);
        articlesRecycler.setLayoutManager(layoutManager);

        dailyArticleAdapter = new DailyArticleAdapter(this, articleList);
        articlesRecycler.setAdapter(dailyArticleAdapter);
    }

    public void goToInterestingFacts(View v){
        Intent intent = new Intent(this, InterestingFacts.class);
        startActivity(intent);
    }

    public void goToProfile(View v){
        Intent intent2 = new Intent(this, Profile.class);
        startActivity(intent2);
    }

    public void goToAddTopic(View v){
        Intent intent3 = new Intent(this, AddTopic.class);
        startActivity(intent3);
    }
}