package org.example.bridge.bridge1.remotes;

import org.example.bridge.bridge1.devices.Device;

public class SuperRemote extends Remote {
    public SuperRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        IO.println("SuperRemote togglePower");
    }

    @Override
    public void volumeUp() {
        IO.println("SuperRemote volume up");
    }

    @Override
    public void volumeDown() {
        IO.println("SuperRemote volume down");
    }

    @Override
    public void channelUp() {
        IO.println("SuperRemote channel up");
    }

    @Override
    public void channelDown() {
        IO.println("SuperRemote channel down");
    }

    public void mute() {
        IO.println("SuperRemote mute");
    }

    public void saveChanel() {
        IO.println("SuperRemote saveChanel");
    }
}
