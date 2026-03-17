package org.example.factorymethodEx.factorymethod.cars;

public class Mercedes implements Car{

    @Override
    public void moving() {
        IO.println("Mercedes moving");
    }
}
