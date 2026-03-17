package org.example.mediatorEx.ex3.mediator;

import org.example.mediatorEx.ex3.service.Service;

import java.util.ArrayList;
import java.util.List;

public class MediatorRoom implements MediatorService {
    private final List<Service> services = new ArrayList<>();



    @Override
    public void addService(Service service) {
        services.add(service);
    }

    @Override
    public void sendState(String state, Service service) {
        services.forEach(el -> {
            if (service != el) el.receive(state);
        });
    }
}
