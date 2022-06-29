package com.example.microlearn_v1.model;

public class DailyArticle {

    int id;
    String title;
    String textArticle;

    public DailyArticle(int id, String title, String textArticle) {
        this.id = id;
        this.title = title;
        this.textArticle = textArticle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextArticle() {
        return textArticle;
    }

    public void setTextArticle(String textArticle) {
        this.textArticle = textArticle;
    }
}
