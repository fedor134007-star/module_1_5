package org.example.adapterEx.adapter2;

public interface SmartDevice {
    void turnOn();
    void turnOff();
    String getStatus(); // Должен возвращать "ON" или "OFF"
}
