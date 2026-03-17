package org.example.bridge.bridge1.devices;

public class Radio implements Device {
    @Override
    public void turnOn() {
        IO.println("Radio turning on");
    }

    @Override
    public void turnOff() {
        IO.println("Radio turning off");
    }

    @Override
    public void volumeUp() {
        IO.println("Radio volume up");
    }

    @Override
    public void volumeDown() {
        IO.println("Radio volume down");
    }

    @Override
    public void getVolume() {
        IO.println("Radio getting volume");
    }

    @Override
    public void setChanel() {
        IO.println("Radio setting chanel");
    }

    @Override
    public void getChanel() {
        IO.println("Radio getting chanel");
    }

    @Override
    public void getStatus() {
        IO.println("Radio getting status");
    }
}
