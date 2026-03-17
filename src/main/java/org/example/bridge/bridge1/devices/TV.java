package org.example.bridge.bridge1.devices;

public class TV implements Device {
    @Override
    public void turnOn() {
        IO.println("TV turning on");
    }

    @Override
    public void turnOff() {
        IO.println("TV turning off");
    }

    @Override
    public void volumeUp() {
        IO.println("TV volume up");
    }

    @Override
    public void volumeDown() {
        IO.println("TV volume down");
    }

    @Override
    public void getVolume() {
        IO.println("TV getting volume");
    }

    @Override
    public void setChanel() {
        IO.println("TV setting chanel");
    }

    @Override
    public void getChanel() {
        IO.println("TV getting chanel");
    }

    @Override
    public void getStatus() {
        IO.println("TV getting status");
    }
}
