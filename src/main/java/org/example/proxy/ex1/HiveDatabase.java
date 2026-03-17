package org.example.proxy.ex1;

public class HiveDatabase implements Database {

    String password;

    public HiveDatabase(String password) {
        this.password = password;
        run();
    }

    @Override
    public void run() {
        IO.println("HiveDatabase run with password: " + password);
    }

    @Override
    public void insert() {
        IO.println("HiveDatabase insert");
    }

    @Override
    public void update() {
        IO.println("HiveDatabase update");
    }

    @Override
    public void delete() {
        IO.println("HiveDatabase delete");
    }
}
