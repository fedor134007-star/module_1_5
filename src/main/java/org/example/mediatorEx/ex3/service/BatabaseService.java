package org.example.mediatorEx.ex3.service;

import org.example.mediatorEx.ex3.mediator.MediatorService;

public class BatabaseService extends Service {

    public BatabaseService(MediatorService mediatorService) {
        super(mediatorService);
    }

    @Override
    public void receive(String state) {
        IO.println("BatabaseService receive state: " + state);
    }

    @Override
    public void send(String state) {
        mediatorService.sendState("connected", this);
    }
}
