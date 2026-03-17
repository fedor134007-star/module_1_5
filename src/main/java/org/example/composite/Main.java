package org.example.composite;

import org.example.composite.task.CreateApiTask;
import org.example.composite.task.CreateDatabaseTask;
import org.example.composite.task.Task;

public class Main {
    static void main() {
        Task taskApi = new CreateApiTask();
        Task taskDatabase = new CreateDatabaseTask();

        TodoComponent composite = new TodoComponent("Composite task");
        composite.addTask(taskApi);
        composite.addTask(taskDatabase);

        composite.createTask();
        composite.updateTask();
        composite.deleteTask();
    }
}
