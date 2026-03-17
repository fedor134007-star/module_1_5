package org.example.bridge.bridge3.car;

import org.example.bridge.bridge3.engine.Engine;

public class BMW extends Car{
    public BMW(Engine engine) {
        super(engine);
    }

    @Override
    public void start() {
        engine.startEngine();
    }
}
