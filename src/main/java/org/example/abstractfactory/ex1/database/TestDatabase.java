package org.example.abstractfactory.ex1.database;

public class TestDatabase implements Database{
    @Override
    public void getNameDatabase() {
        IO.println("TestDatabase");
    }
}
