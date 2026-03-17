package org.example.factorymethodEx.factorymethod.factory;

import org.example.factorymethodEx.factorymethod.cars.Car;

public abstract class TaxiTariff {
    void signal() {
        IO.println("Bip-bip");
    }

    public abstract Car createCar();
}
