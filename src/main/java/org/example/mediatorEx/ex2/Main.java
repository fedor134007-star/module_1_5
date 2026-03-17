package org.example.mediatorEx.ex2;

import org.example.mediatorEx.ex2.device.RemoteDevice;
import org.example.mediatorEx.ex2.mediator.CommandMediator;
import org.example.mediatorEx.ex2.mediator.DeviceMediator;

public class Main {
    static void main() {
        DeviceMediator mediator = new CommandMediator();
        RemoteDevice remoteTV = new RemoteDevice("TV", mediator);
        RemoteDevice remoteBLE = new RemoteDevice("BLE", mediator);
        RemoteDevice remoteRadio = new RemoteDevice("RADIO", mediator);
        mediator.addDevice(remoteTV);
        mediator.addDevice(remoteBLE);
        mediator.addDevice(remoteRadio);

        remoteTV.sendCommand("value ++ ");
    }
}
