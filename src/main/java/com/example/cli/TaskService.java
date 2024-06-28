package com.example.cli;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import org.springframework.stereotype.Component;

@Service
public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }
}
