package com.yofyt.yofy.model;

import lombok.Getter;
import lombok.Setter;

public class Thread {
    @Getter
    private int postNumber;
    @Getter
    private int originalPosterID;
    @Getter
    private String title;
    @Getter
    private String body;

    public Thread(int pn, int opID, String t, String b) {
        this.postNumber = pn;
        this.originalPosterID = opID;
        this.title = t;
        this.body = b;
    }
}

