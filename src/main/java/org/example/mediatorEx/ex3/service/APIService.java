package org.example.mediatorEx.ex3.service;

import org.example.mediatorEx.ex3.mediator.MediatorService;

public class APIService extends Service {

    public APIService(MediatorService mediatorService) {
        super(mediatorService);
    }

    @Override
    public void receive(String state) {
        IO.println("APIService receive state: " + state);
    }

    @Override
    public void send(String state) {
        mediatorService.sendState("connected", this);
    }
}
