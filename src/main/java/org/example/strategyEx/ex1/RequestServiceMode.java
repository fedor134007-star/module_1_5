package org.example.strategyEx.ex1;

public class RequestServiceMode implements  Strategy {
    @Override
    public void runMethod() {
        IO.println("RequestServiceModeStrategy.runMethod()");
    }
}
