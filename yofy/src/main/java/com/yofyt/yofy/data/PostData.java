package com.yofyt.yofy.data;
import com.yofyt.yofy.model.Thread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PostData {
    static List<Thread> posts = new ArrayList<>();
    private static String dataPath = "PostData.txt";

    public static void save() throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dataPath, false))) {
            for (Thread thread : posts) {
                bufferedWriter.write(thread.getPostNumber());
            }
        }
    }

}
