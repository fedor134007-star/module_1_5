package org.example.mediatorEx.ex2.device;

import org.example.mediatorEx.ex2.mediator.DeviceMediator;

public abstract class Device {
    String name;
    DeviceMediator mediator;

    public Device(String name, DeviceMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }


    public abstract void sendCommand(String command);

    public abstract void receive(String command);
}
