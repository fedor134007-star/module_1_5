package org.example.bridge.bridge2.delivery;

import org.example.bridge.bridge2.restaurant.Restaurant;

public class CarDelivery extends Delivery {
    public CarDelivery(Restaurant restaurant) {
        super(restaurant);
    }

    @Override
    public void delivery() {
        IO.println("Car Delivery high speed");
    }
}
