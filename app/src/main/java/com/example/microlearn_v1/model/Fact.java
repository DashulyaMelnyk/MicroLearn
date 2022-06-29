package com.example.microlearn_v1.model;

public class Fact {

    int id;
    String text;
    String link;
    String imgPath;

    public Fact(int id, String text, String link, String imgPath) {
        this.id = id;
        this.text = text;
        this.link = link;
        this.imgPath = imgPath;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
