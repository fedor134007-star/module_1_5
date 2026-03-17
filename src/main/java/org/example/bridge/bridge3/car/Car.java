package org.example.bridge.bridge3.car;

import org.example.bridge.bridge3.engine.Engine;

public abstract class Car {
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    abstract public void start();
}
