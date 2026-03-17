package org.example.bridge.bridge2.restaurant;

public class JapanRestaurant implements Restaurant {


    @Override
    public void preparesFood() {
        IO.println("JapanRestaurant preparesFood");
    }
}
