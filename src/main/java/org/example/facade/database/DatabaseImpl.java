package org.example.facade.database;

public class DatabaseImpl implements Database {
    @Override
    public void create() {
        IO.println("Creating data");
    }

    @Override
    public void update() {
        IO.println("update data");

    }

    @Override
    public void delete() {
        IO.println("delete data");

    }
}
