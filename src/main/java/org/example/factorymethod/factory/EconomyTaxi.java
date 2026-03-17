package org.example.factorymethod.factory;

import org.example.factorymethod.cars.Toyota;

public class EconomyTaxi extends TaxiTariff {
    @Override
    public Toyota createCar() {
        return new Toyota();
    }
}
