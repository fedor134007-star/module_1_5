package org.example.bridge.bridge1.devices;

public class Projector implements Device {
    @Override
    public void turnOn() {
        IO.println("Projector turning on");
    }

    @Override
    public void turnOff() {
        IO.println("Projector turning off");
    }

    @Override
    public void volumeUp() {
        IO.println("Projector volume up");
    }

    @Override
    public void volumeDown() {
        IO.println("Projector volume down");
    }

    @Override
    public void getVolume() {
        IO.println("Projector getting volume");
    }

    @Override
    public void setChanel() {
        IO.println("Projector setting chanel");
    }

    @Override
    public void getChanel() {
        IO.println("Projector getting chanel");
    }

    @Override
    public void getStatus() {
        IO.println("Projector getting status");
    }
}
