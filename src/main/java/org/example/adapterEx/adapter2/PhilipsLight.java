package org.example.adapterEx.adapter2;

public class PhilipsLight {
    private boolean on = false;

    public void turnOnLight() {
        on = true;
        System.out.println("Philips: Свет включен");
    }

    public void turnOffLight() {
        on = false;
        System.out.println("Philips: Свет выключен");
    }

    public boolean isLightOn() {
        return on;
    }
}


