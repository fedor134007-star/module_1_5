package org.example.facade.ble;

public class BleImpl implements Ble {
    @Override
    public void turnOnServiceMode() {
        IO.println("ServiceMode ON");
    }

    @Override
    public void turnOffServiceMode() {
        IO.println("ServiceMode OFF");
    }
}
