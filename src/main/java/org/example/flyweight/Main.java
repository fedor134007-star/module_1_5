package org.example.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Car> cars = new ArrayList<>();
        CarFactory carFactory = new CarFactory();

        cars.add(carFactory.getCar("CtyCar"));
        cars.add(carFactory.getCar("CtyCar"));
        cars.add(carFactory.getCar("CtyCar"));
        cars.add(carFactory.getCar("CtyCar"));
        cars.add(carFactory.getCar("CtyCar"));
        cars.add(carFactory.getCar("CtyCar"));
        cars.add(carFactory.getCar("SportCar"));
        cars.add(carFactory.getCar("SportCar"));
        cars.add(carFactory.getCar("SportCar"));
        cars.add(carFactory.getCar("SportCar"));
        cars.add(carFactory.getCar("SportCar"));
        cars.add(carFactory.getCar("SportCar"));
        cars.add(carFactory.getCar("SportCar"));

        cars.forEach(Car::drive);

       IO.println( carFactory.getSize());
    }
}
