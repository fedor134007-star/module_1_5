package org.example.observerEx.ex2;

public class Main {
    static void main() {
        WeatherStation weatherStation = new WeatherStation();
        WeatherStationDevice device1 = new WeatherStationDevice();
        WeatherStationDevice device2 = new WeatherStationDevice();
        weatherStation.addObserver(device1);
        weatherStation.addObserver(device2);


        weatherStation.setTemperature(14);

    }
}
