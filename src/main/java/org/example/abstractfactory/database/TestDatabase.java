package org.example.abstractfactory.database;

import org.example.abstractfactory.server.Server;

public class TestDatabase implements Database{
    @Override
    public void getNameDatabase() {
        IO.println("TestDatabase");
    }
}
