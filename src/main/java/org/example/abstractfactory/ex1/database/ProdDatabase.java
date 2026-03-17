package org.example.abstractfactory.ex1.database;

public class ProdDatabase implements Database {

    @Override
    public void getNameDatabase() {
        IO.println("ProdDatabase");
    }
}
