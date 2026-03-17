package org.example.abstractfactory.database;

public class DevDatabase implements Database {
    @Override
    public void getNameDatabase() {
        IO.println("DevDatabase");
    }
}
