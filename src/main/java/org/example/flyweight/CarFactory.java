package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private Map<String, Car> cars = new HashMap<>();

    public Car getCar(String key) {
        Car car = cars.get(key);
        if (car == null) {
            switch (key) {
                case "CtyCar":
                    car = new CtyCar();
                    break;
                case "SportCar":
                    car = new SportCar();
                    break;
            }
            cars.put(key, car);
        }
        return car;
    }

    public int getSize() {
        return cars.size();
    }
}
