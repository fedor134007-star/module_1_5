package org.example.factorymethodEx.factorymethod.factory;

import org.example.factorymethodEx.factorymethod.cars.Mercedes;

public class BusinessTaxi extends TaxiTariff {
    @Override
    public Mercedes createCar() {
        return new Mercedes();
    }
}
