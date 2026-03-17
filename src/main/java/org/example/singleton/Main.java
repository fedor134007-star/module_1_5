package org.example.singleton;

import org.example.abstractfactory.database.Database;

public class Main {
    public static void main(String[] args) {
        DataBase.getInstance().showNameDataBase();
    }
}
