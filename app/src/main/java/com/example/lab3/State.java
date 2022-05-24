package com.example.lab3;

public class State {
    private String name;
    private String info;
    private int imgId;

    public State(String name, String info, int imgId) {
        this.name = name;
        this.info = info;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
