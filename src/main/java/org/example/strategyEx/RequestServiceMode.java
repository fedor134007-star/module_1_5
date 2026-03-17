package org.example.strategyEx;

public class RequestServiceMode implements  Strategy {
    @Override
    public void runMethod() {
        IO.println("RequestServiceModeStrategy.runMethod()");
    }
}
