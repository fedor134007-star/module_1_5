package org.example.singleton.ex1;

public class DataBase {
    private static DataBase instance;

    private DataBase() {}

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
