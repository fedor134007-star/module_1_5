package org.example.strategyEx;

public class RejectServiceMode implements Strategy {
    @Override
    public void runMethod() {
        IO.println("RequestServiceModeStrategy.runMethod()");
    }
}
