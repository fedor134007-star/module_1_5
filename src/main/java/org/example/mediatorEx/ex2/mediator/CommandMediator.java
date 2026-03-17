package org.example.mediatorEx.ex2.mediator;

import org.example.mediatorEx.ex2.device.Device;

import java.util.ArrayList;
import java.util.List;

public class CommandMediator implements DeviceMediator {
    List<Device> devices = new ArrayList<Device>();

    @Override
    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void sendCommand(String command, Device deviceSender) {
       for (Device device : devices) {
           if(device != deviceSender) device.receive(command);
       }
    }
}
