package com.yofyt.yofy.data;
import com.yofyt.yofy.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserData {
    List<User> users = new ArrayList<>();
    private String dataPath = "UserData.txt";

    public void saveUsers() throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dataPath, false))) {
            for (User user : users) {
                bufferedWriter.write(user.getUsername());
                bufferedWriter.newLine();
                bufferedWriter.write(user.getUserID());
                bufferedWriter.newLine();
                bufferedWriter.write("START BIO");
                bufferedWriter.newLine();
                bufferedWriter.write(user.getBio());
                bufferedWriter.newLine();
                bufferedWriter.write("END BIO");
                bufferedWriter.newLine();
                bufferedWriter.write(user.getGender());
                bufferedWriter.newLine();
                bufferedWriter.write(user.getAge());
                bufferedWriter.newLine();
                bufferedWriter.write(user.getMood());
                bufferedWriter.newLine();
                bufferedWriter.newLine();
            }
        }
    }
    public void initializeUsers() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dataPath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Read and construct each user
                String username = line; // First line is the username
                String userID = bufferedReader.readLine(); // Second line is the userID

                // Handle the bio which starts and ends with markers
                StringBuilder bio = new StringBuilder();
                bufferedReader.readLine(); // Read "START BIO"
                while (!(line = bufferedReader.readLine()).equals("END BIO")) {
                    bio.append(line).append("\n");
                }

                String gender = bufferedReader.readLine(); // Read gender
                String age = bufferedReader.readLine(); // Read age
                String mood = bufferedReader.readLine(); // Read mood

                bufferedReader.readLine(); // Skip the blank line between users

                // Create the User object and add it to the list
                User user = new User(username, Integer.parseInt(userID), bio.toString(),
                        gender, Integer.parseInt(age), mood);
                users.add(user);
            }
        }
    }
}
