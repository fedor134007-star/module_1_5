package org.example.mediatorEx.ex3;

import org.example.mediatorEx.ex3.mediator.MediatorRoom;
import org.example.mediatorEx.ex3.mediator.MediatorService;
import org.example.mediatorEx.ex3.service.APIService;
import org.example.mediatorEx.ex3.service.BatabaseService;
import org.example.mediatorEx.ex3.service.BleService;
import org.example.mediatorEx.ex3.service.Service;

public class Main {
    static void main() {
        MediatorService mediatorService = new MediatorRoom();
        Service ble = new BleService(mediatorService);
        Service data = new BatabaseService(mediatorService);
        Service api = new APIService(mediatorService);

        mediatorService.addService(data);
        mediatorService.addService(ble);
        mediatorService.addService(api);

        mediatorService.sendState("connected" , ble);
        mediatorService.sendState("disconnected" , ble);
    }
}
