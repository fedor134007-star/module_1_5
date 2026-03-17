package org.example.mediatorEx.ex3.service;

import org.example.mediatorEx.ex3.mediator.MediatorService;

public class BleService extends Service {

    public BleService(MediatorService mediatorService) {
        super(mediatorService);
    }

    @Override
    public void receive(String state) {
        IO.println("BleService receive state: " + state);
    }

    @Override
    public void send(String state) {
        mediatorService.sendState("connected", this);
    }
}
