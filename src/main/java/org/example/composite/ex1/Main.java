package org.example.composite.ex1;

import org.example.composite.ex1.task.CreateApiTask;
import org.example.composite.ex1.task.CreateDatabaseTask;
import org.example.composite.ex1.task.Task;
import org.example.composite.ex1.task.TodoComponent;

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
