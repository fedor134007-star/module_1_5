package org.example.bridge.bridge1.devices;

public interface Device {
    void turnOn();
    void turnOff();
    void volumeUp();
    void volumeDown();
    void getVolume();
    void setChanel();
    void getChanel();
    void getStatus();
}
// Должен содержать методы:
// - включить/выключить
// - установить громкость
// - получить громкость
// - установить канал
// - получить канал
// - показать статус (включено ли, текущая громкость, текущий канал)