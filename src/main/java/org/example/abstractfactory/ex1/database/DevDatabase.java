package org.example.abstractfactory.ex1.database;

public class DevDatabase implements Database {
    @Override
    public void getNameDatabase() {
        IO.println("DevDatabase");
    }
}
