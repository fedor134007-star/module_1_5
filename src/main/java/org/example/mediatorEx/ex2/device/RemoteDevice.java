package org.example.mediatorEx.ex2.device;

import org.example.mediatorEx.ex2.mediator.DeviceMediator;

public class RemoteDevice extends Device {
    public RemoteDevice(String name, DeviceMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendCommand(String command) {
        mediator.sendCommand(command, this);
    }

    @Override
    public void receive(String command) {
        IO.println("Device " + name + " received command: " + command);
    }
}
