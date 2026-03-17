package org.example.adapterEx.adapter2;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeSystem {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllOn() {
        System.out.println("Включаем все устройства:");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("Выключаем все устройства:");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public void showAllStatus() {
        System.out.println("Статус всех устройств:");
        for (int i = 0; i < devices.size(); i++) {
            System.out.println("Устройство " + (i + 1) + ": " + devices.get(i).getStatus());
        }
    }
}
