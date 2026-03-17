package org.example.strategyEx.ex1;

public class AcceptServiceMode implements Strategy {

    @Override
    public void runMethod() {
        IO.println("AcceptServiceMode.runMethod()");
    }
}
