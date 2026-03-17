package org.example.factorymethod;

import org.example.factorymethod.cars.Car;
import org.example.factorymethod.factory.StandardTaxi;
import org.example.factorymethod.factory.BusinessTaxi;
import org.example.factorymethod.factory.EconomyTaxi;
import org.example.factorymethod.factory.TaxiTariff;


public class Taxi {
    static void main() {
        TaxiTariff standardTaxi = createCar("BMW");
        Car bmw = standardTaxi.createCar();
        bmw.moving();

        TaxiTariff economyTaxi = createCar("Toyota");
        Car toyota = economyTaxi.createCar();
        toyota.moving();

        TaxiTariff businessTaxi = createCar("Mercedes");
        Car mercedes = businessTaxi.createCar();
        mercedes.moving();
    }


    static TaxiTariff createCar(String car) {
        return switch (car) {
            case "Toyota" -> new EconomyTaxi();
            case "BMW" -> new StandardTaxi();
            case "Mercedes" -> new BusinessTaxi();
            default -> new EconomyTaxi();
        };
    }
}
