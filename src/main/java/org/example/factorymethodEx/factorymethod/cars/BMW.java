package org.example.factorymethodEx.factorymethod.cars;

public class BMW implements Car {
    @Override
    public void moving() {
        IO.println("BMW moving");
    }
}
