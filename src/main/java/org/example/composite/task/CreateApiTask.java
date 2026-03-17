package org.example.composite.task;

public class CreateApiTask implements Task {
    @Override
    public void createTask() {
        IO.println("Creating API task...");
    }

    @Override
    public void updateTask() {
        IO.println("Updating API task...");
    }

    @Override
    public void deleteTask() {
        IO.println("Deleting API task...");
    }
}
