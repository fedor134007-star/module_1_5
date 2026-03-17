package org.example.mediatorEx.ex3.mediator;

import org.example.mediatorEx.ex3.service.Service;

public interface MediatorService {
    void addService(Service service);
    void sendState(String state, Service service);
}
