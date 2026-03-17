package org.example.abstractfactory.ex2.Car;

import org.example.abstractfactory.ex2.detailscar.engine.Engine;
import org.example.abstractfactory.ex2.detailscar.engine.Turbo50;
import org.example.abstractfactory.ex2.detailscar.transmission.Automatic;
import org.example.abstractfactory.ex2.detailscar.transmission.Transmission;

public class CityDetails implements InitDetails {


    @Override
    public Engine createEngine() {
        return new Turbo50();
    }

    @Override
    public Transmission createTransmission() {
        return new Automatic();
    }
}
