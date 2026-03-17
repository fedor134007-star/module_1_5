package org.example.singleton.ex2;

public class Apple {
    private static Apple instance;

    private Apple() {
    }

    public static Apple getInstance() {
        if (instance == null) {
            instance = new Apple();
        }
        return instance;
    }


    void sunny() {
        IO.println("Hello World!");
    }
}
