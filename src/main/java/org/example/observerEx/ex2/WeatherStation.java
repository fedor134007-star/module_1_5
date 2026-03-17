package org.example.observerEx.ex2;

import org.example.observerEx.ex2.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private float temperature;
    private List<Observer> listObserver = new ArrayList<>();


    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        listObserver.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        listObserver.remove(o);
    }

    @Override
    public void notifyObservers() {
        listObserver.forEach(el -> el.update(temperature));
    }
}
