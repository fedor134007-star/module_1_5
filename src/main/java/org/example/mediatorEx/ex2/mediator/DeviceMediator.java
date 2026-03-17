package org.example.mediatorEx.ex2.mediator;

import org.example.mediatorEx.ex2.device.Device;

public interface DeviceMediator {
    void addDevice(Device device);
    void sendCommand(String command, Device deviceSender);
}
