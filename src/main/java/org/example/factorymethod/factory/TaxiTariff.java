package org.example.factorymethod.factory;

import org.example.factorymethod.cars.Car;

public abstract class TaxiTariff {
    void signal() {
        IO.println("Bip-bip");
    }

    public abstract Car createCar();
}
