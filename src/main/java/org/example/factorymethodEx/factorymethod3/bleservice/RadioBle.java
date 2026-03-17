package org.example.factorymethodEx.factorymethod3.bleservice;

import org.example.factorymethodEx.factorymethod3.device.Device;
import org.example.factorymethodEx.factorymethod3.device.Radio;

public class RadioBle implements Ble {
    Device device;

    @Override
    public void createDevice() {
        this.device = new Radio();
    }

    @Override
    public void connect() {
        IO.println("RadioBle is connected to " + this.device);
    }

    @Override
    public void disconnect() {
        IO.println("RadioBle is disconnected to " + this.device);
    }

    @Override
    public void sendFile(String file) {
        IO.println("RadioBle is sending to " + this.device);
    }
}
