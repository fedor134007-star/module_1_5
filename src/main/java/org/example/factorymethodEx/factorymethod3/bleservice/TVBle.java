package org.example.factorymethodEx.factorymethod3.bleservice;

import org.example.factorymethodEx.factorymethod3.device.Device;
import org.example.factorymethodEx.factorymethod3.device.TV;

public class TVBle implements Ble {
    Device device;

    @Override
    public void createDevice() {
        this.device = new TV();
    }

    @Override
    public void connect() {
        IO.println("TVBle is connecting to " + this.device);
    }

    @Override
    public void disconnect() {
        IO.println("TVBle is disconnecting from " + this.device);
    }

    @Override
    public void sendFile(String file) {
        IO.println("TVBle is sending to " + this.device);
    }


}
