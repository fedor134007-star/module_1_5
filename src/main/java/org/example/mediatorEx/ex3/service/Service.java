package org.example.mediatorEx.ex3.service;

import org.example.mediatorEx.ex3.mediator.MediatorService;

public abstract class Service {
    protected MediatorService mediatorService;

    public Service(MediatorService mediatorService) {
        this.mediatorService = mediatorService;
    }
    public abstract void receive(String state);
    public abstract void send(String state);
}
