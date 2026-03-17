package org.example.strategyEx;

public class AcceptServiceMode implements Strategy {

    @Override
    public void runMethod() {
        IO.println("AcceptServiceMode.runMethod()");
    }
}
