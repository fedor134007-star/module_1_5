package org.example.decorator.ex2.tractor;

public class CatTractor implements Tractor {
    private String model;

    public CatTractor(String model) {
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
