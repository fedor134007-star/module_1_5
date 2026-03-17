package org.example.factorymethod.cars;

public class Mercedes implements Car{

    @Override
    public void moving() {
        IO.println("Mercedes moving");
    }
}
