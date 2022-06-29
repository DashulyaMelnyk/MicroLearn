package com.example.microlearn_v1.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.microlearn_v1.ArticlePage;
import com.example.microlearn_v1.R;
import com.example.microlearn_v1.model.DailyArticle;

import java.util.ArrayList;
import java.util.List;

public class DailyArticleAdapter extends RecyclerView.Adapter<DailyArticleAdapter.DailyArticleViewHolder> {


    Context context;
    List<DailyArticle> dailyArticles;

    public DailyArticleAdapter(Context context, List<DailyArticle> dailyArticles) {
        this.context = context;
        this.dailyArticles = dailyArticles;
    }

    @NonNull
    @Override
    public DailyArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View articlesItem = LayoutInflater.from(context).inflate(R.layout.daily_article_item, parent, false);
        return new DailyArticleViewHolder(articlesItem);
    }

    @Override
    public void onBindViewHolder(@NonNull DailyArticleViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.blockTitle.setText(dailyArticles.get(position).getTitle());
        holder.blockText.setText(dailyArticles.get(position).getTextArticle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ArticlePage.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(
                        (Activity) context,
                        new Pair<View, String>(holder.blockTitle, "titleTheme"));
                intent.putExtra("name_theme",dailyArticles.get(position).getTitle());
                intent.putExtra("text_theme",dailyArticles.get(position).getTextArticle());
                context.startActivity(intent, options.toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return dailyArticles.size();
    }

    public static final class DailyArticleViewHolder extends RecyclerView.ViewHolder{

        TextView blockTitle;
        TextView blockText;

        public DailyArticleViewHolder(@NonNull View itemView) {
            super(itemView);
            blockTitle = itemView.findViewById(R.id.blockTitle);
            blockText = itemView.findViewById(R.id.blockText);
        }
    }
}
