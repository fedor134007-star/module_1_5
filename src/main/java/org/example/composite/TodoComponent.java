package org.example.composite;

import org.example.composite.task.Task;

import java.util.ArrayList;
import java.util.List;

public class TodoComponent implements Task {
    private String name;
    private List<Task> taskList = new ArrayList<Task>();


    TodoComponent(String name) {
        this.name = name;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(Task task) {
        taskList.remove(task);
    }

    @Override
    public void createTask() {
        IO.println(name + " createTask");
        for (Task task : taskList) {
            task.createTask();
        }
    }

    @Override
    public void updateTask() {
        IO.println(name + " updateTask");
        for (Task task : taskList) {
            task.updateTask();
        }
    }

    @Override
    public void deleteTask() {
        IO.println(name + " deleteTask");
        for (Task task : taskList) {
            task.deleteTask();
        }
    }
}
