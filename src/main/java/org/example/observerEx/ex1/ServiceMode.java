package org.example.observerEx.ex1;

import java.util.ArrayList;
import java.util.List;

public class ServiceMode implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    boolean stateServiceMode = false;

    void activateServiceMode() {
        stateServiceMode = true;
        notifyObservers();
    }

    void deactivateServiceMode() {
        stateServiceMode = false;
        notifyObservers();
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(el -> el.update(stateServiceMode));
    }
}
