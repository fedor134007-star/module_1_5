package org.example.observerEx.ex2;

public class WeatherStationDevice implements Observer {
    private float temperature;

    void getTemperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public float update(float temperature) {
        IO.println("Listen T " + temperature);
        return this.temperature = temperature;
    }
}
