package org.example.factorymethodEx.factorymethod.factory;

import org.example.factorymethodEx.factorymethod.cars.BMW;

public class StandardTaxi extends TaxiTariff {

    @Override
    public BMW createCar() {
        return new BMW();
    }
}
