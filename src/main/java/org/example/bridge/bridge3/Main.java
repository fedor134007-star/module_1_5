package org.example.bridge.bridge3;

import org.example.bridge.bridge3.car.BMW;
import org.example.bridge.bridge3.car.Car;
import org.example.bridge.bridge3.car.Toyota;
import org.example.bridge.bridge3.engine.Engine20;
import org.example.bridge.bridge3.engine.EngineV10;

public class Main {
    static void main() {
        Car bmw = new BMW(new EngineV10());
        Car toyota = new Toyota(new Engine20());

        bmw.start();
        toyota.start();
    }
}
