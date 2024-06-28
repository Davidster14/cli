package com.example.cli;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
public class ConsoleApp implements CommandLineRunner{
    @Autowired
    private TaskService taskService;

    public static void main(String[] args) {
        SpringApplication.run(ConsoleApp.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. List tasks");
            System.out.println("3. Delete task");
            System.out.println("4. Exit");
            System.out.print("Enter a number: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    Task task = new Task(title, description);
                    taskService.addTask(task);
                    System.out.println("Task added successfully");
                    break;
                case 2:
                    System.out.println("Tasks:");
                    for (Task t : taskService.getTasks()) {
                        System.out.println(t.getId() + " " + t.getTitle() + " " + t.getDescription());
                    }
                    break;
                case 3:
                    System.out.print("Enter task id: ");
                    int id = scanner.nextInt();
                    taskService.deleteTask(id);
                    System.out.println("Task deleted successfully");
                    break;
                case 4:
                    System.exit(0);
            }
            
        }
    }

}
