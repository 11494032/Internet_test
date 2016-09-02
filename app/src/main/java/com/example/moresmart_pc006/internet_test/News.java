package com.example.moresmart_pc006.internet_test;

public class News{
    private String title;
    private String descripton;
    private String image;
    int type;
    int comment;

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", descripton='" + descripton + '\'' +
                ", image='" + image + '\'' +
                ", type=" + type +
                ", comment=" + comment +
                '}';
    }
}
