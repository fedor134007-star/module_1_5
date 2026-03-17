package org.example.strategyEx.ex1;

public class ServiceMode {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        IO.println(strategy);
        return strategy;
    }

    public void runMethod() {
        strategy.runMethod();
    }
}
