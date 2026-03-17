package org.example.bridge.bridge2.restaurant;

public class TurkeyRestaurant implements Restaurant {

    @Override
    public void preparesFood() {
        IO.println("TurkeyRestaurant preparesFood");
    }
}
