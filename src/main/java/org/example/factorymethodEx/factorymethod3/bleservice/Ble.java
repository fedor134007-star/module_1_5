package org.example.factorymethodEx.factorymethod3.bleservice;


import org.example.factorymethodEx.factorymethod3.device.Device;

public interface Ble {

    void createDevice();
    void connect();
    void disconnect();
    void sendFile(String file);
}
