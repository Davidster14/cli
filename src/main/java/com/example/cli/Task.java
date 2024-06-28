package com.example.cli;

public class Task {
    private static int count = 0;
    private int id;
    private String title;
    private String description;

    public Task(String title, String description) {
        this.id = count++;
        this.title = title;
        this.description = description;
    }
    public int getId() {
        return id;
    }
    //Generated getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
