package org.example.bridge.bridge2;

import org.example.bridge.bridge2.delivery.AirDelivery;
import org.example.bridge.bridge2.delivery.CarDelivery;
import org.example.bridge.bridge2.restaurant.EuropaRestaurant;
import org.example.bridge.bridge2.restaurant.JapanRestaurant;
import org.example.bridge.bridge2.restaurant.TurkeyRestaurant;

public class Main {
    public static void main(String[] args) {
        AirDelivery airDelivery = new AirDelivery(new EuropaRestaurant());
        AirDelivery airDelivery2 = new AirDelivery(new TurkeyRestaurant());
        CarDelivery carDelivery = new CarDelivery(new JapanRestaurant());

        airDelivery.delivery();
        airDelivery2.delivery();
        carDelivery.delivery();
        airDelivery.crashAir();
    }

}
