package org.example.bridge.bridge1.remotes;

import org.example.bridge.bridge1.devices.Device;

public class BaseRemote extends Remote {
    public BaseRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        IO.println("BaseRemote togglePower");
    }

    @Override
    public void volumeUp() {
        IO.println("BaseRemote volumeUp");
    }

    @Override
    public void volumeDown() {
        IO.println("BaseRemote volumeDown");
    }

    @Override
    public void channelUp() {
        IO.println("BaseRemote channelUp");
    }

    @Override
    public void channelDown() {
        IO.println("BaseRemote channelDown");
    }
}
