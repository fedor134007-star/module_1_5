package org.example.factorymethodEx.factorymethod.factory;

import org.example.factorymethodEx.factorymethod.cars.Toyota;

public class EconomyTaxi extends TaxiTariff {
    @Override
    public Toyota createCar() {
        return new Toyota();
    }
}
