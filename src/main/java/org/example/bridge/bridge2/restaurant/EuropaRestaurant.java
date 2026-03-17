package org.example.bridge.bridge2.restaurant;

public class EuropaRestaurant implements Restaurant {
    @Override
    public void preparesFood() {
        IO.println("EuropaRestaurant preparesFood");
    }
}
