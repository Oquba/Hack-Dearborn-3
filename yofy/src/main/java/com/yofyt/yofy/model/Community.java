package com.yofyt.yofy.model;

import java.util.ArrayList;
import java.util.List;

public class Community {
    List<Thread> communityPosts = new ArrayList<>();

    public void addNewpost(Thread post) {
        communityPosts.add(post);
    }
}
