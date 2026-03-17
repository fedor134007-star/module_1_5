package org.example.composite.task;

public class CreateDatabaseTask implements Task {
    @Override
    public void createTask() {
        IO.println("Creating Database task...");
    }

    @Override
    public void updateTask() {
        IO.println("Updating Database task...");
    }

    @Override
    public void deleteTask() {
        IO.println("Deleting Database task...");
    }
}
