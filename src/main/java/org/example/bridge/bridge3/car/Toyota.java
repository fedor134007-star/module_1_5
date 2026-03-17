package org.example.bridge.bridge3.car;

import org.example.bridge.bridge3.engine.Engine;

public class Toyota extends Car {
    public Toyota(Engine engine) {
        super(engine);
    }

    @Override
    public void start() {
        engine.startEngine();
    }
}
