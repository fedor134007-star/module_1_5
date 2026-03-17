package org.example.bridge.bridge2.delivery;

import org.example.bridge.bridge2.restaurant.Restaurant;

public abstract class Delivery {
    protected Restaurant restaurant;

    Delivery(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public abstract void delivery();
}
