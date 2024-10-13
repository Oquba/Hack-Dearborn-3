package com.yofyt.yofy.model;

public class Thread {
    private int postNumber;
    private int originalPosterID;
    private String title;
    private String body;

    public Thread(int pn, int opID, String t, String b) {
        this.postNumber = pn;
        this.originalPosterID = opID;
        this.title = t;
        this.body = b;
    }

    public int getPostNumber() {
        return this.postNumber;
    }
    public int getOriginialPosterID() {
        return this.originalPosterID;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return this.body;
    }
}

