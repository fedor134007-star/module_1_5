package org.example.factorymethodEx.factorymethod.cars;

public class Toyota implements Car {
    @Override
    public void moving() {
        IO.println("Toyota moving");
    }
}
