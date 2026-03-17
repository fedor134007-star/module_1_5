package org.example.bridge.bridge1.remotes;

import org.example.bridge.bridge1.devices.Device;

public abstract class Remote {
    protected Device device;

    Remote(Device device) {
        this.device = device;
    }

    abstract public void togglePower();
    abstract public void volumeUp();
    abstract public void volumeDown();
    abstract public void channelUp();
    abstract public void channelDown();

}
// Конструктор с устройством

// Абстрактные методы:
// - togglePower()     // вкл/выкл
// - volumeUp()        // громкость +
// - volumeDown()      // громкость -
// - channelUp()       // канал +
// - channelDown()     // канал -