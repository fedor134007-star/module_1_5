package org.example.abstractfactory.ex2.Car;


import org.example.abstractfactory.ex2.detailscar.engine.Engine;
import org.example.abstractfactory.ex2.detailscar.engine.V10;
import org.example.abstractfactory.ex2.detailscar.transmission.Manual;
import org.example.abstractfactory.ex2.detailscar.transmission.Transmission;

public class SportDetails implements InitDetails {
    @Override
    public Engine createEngine() {
        return new V10();
    }

    @Override
    public Transmission createTransmission() {
        return new Manual();
    }
}
