package org.example.decorator.ex2.tractor;

public class K700Tractor implements Tractor {

    private String model;

    public K700Tractor(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        IO.println(model + " start");
    }

    @Override
    public void work() {
        IO.println(model + " work");
    }
}
