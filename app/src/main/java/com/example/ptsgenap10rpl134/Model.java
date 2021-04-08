package com.example.ptsgenap10rpl134;

public class Model {
    private String Title;
    private String Deskripsi;
    private int img;

    public String getTitle(String profile) {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDeskripsi(String user_profile) {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
