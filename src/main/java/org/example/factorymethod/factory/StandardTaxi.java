package org.example.factorymethod.factory;

import org.example.factorymethod.cars.BMW;

public class StandardTaxi extends TaxiTariff {

    @Override
    public BMW createCar() {
        return new BMW();
    }
}
