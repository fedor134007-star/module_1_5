package org.example.abstractfactory.ex2.Car;

import org.example.abstractfactory.ex2.detailscar.engine.Engine;
import org.example.abstractfactory.ex2.detailscar.transmission.Transmission;

public interface InitDetails {
    Engine createEngine();
    Transmission createTransmission();
}
