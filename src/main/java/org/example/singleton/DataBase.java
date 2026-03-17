package org.example.singleton;

public class DataBase {
    private static DataBase instance;

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    public void showNameDataBase() {
        IO.println("HIVE");
    }
}
