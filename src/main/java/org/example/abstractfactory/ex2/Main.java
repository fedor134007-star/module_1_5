package org.example.abstractfactory.ex2;

import org.example.abstractfactory.ex2.Car.CityDetails;
import org.example.abstractfactory.ex2.Car.SportDetails;
import org.example.abstractfactory.ex2.detailscar.engine.Engine;
import org.example.abstractfactory.ex2.detailscar.transmission.Transmission;

public class Main {


    static void main() {
        CityDetails cityDetails = new CityDetails();
        Engine engine = cityDetails.createEngine();
        Transmission transmission = cityDetails.createTransmission();
        engine.startEngine();
        transmission.startTransmission();

        SportDetails sportDetails = new SportDetails();
        Engine engineSport = sportDetails.createEngine();
        Transmission transmissionSport = sportDetails.createTransmission();
        engineSport.startEngine();
        transmissionSport.startTransmission();
    }
}
