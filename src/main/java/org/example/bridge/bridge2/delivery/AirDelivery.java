package org.example.bridge.bridge2.delivery;

import org.example.bridge.bridge2.restaurant.Restaurant;

public class AirDelivery extends Delivery {
    public AirDelivery(Restaurant restaurant) {
        super(restaurant);
    }

    @Override
    public void delivery() {
        IO.println("Air Delivery delivery on AIR");
    }

    public void crashAir() {
        IO.println("Air Delivery big booooom");
    }
}
