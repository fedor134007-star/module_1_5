package org.example.abstractfactory.database;

public class ProdDatabase implements Database {

    @Override
    public void getNameDatabase() {
        IO.println("ProdDatabase");
    }
}
