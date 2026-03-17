package org.example.factorymethod.factory;

import org.example.factorymethod.cars.Mercedes;

public class BusinessTaxi extends TaxiTariff {
    @Override
    public Mercedes createCar() {
        return new Mercedes();
    }
}
