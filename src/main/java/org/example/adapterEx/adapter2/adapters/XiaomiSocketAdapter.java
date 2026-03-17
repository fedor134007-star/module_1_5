package org.example.adapterEx.adapter2.adapters;

import org.example.adapterEx.adapter2.SmartDevice;
import org.example.adapterEx.adapter2.XiaomiSocket;

public class XiaomiSocketAdapter implements SmartDevice {

    XiaomiSocket xiaomiSocket;

    public XiaomiSocketAdapter(XiaomiSocket xiaomiSocket) {
        this.xiaomiSocket = xiaomiSocket;
    }

    @Override
    public void turnOn() {
        xiaomiSocket.powerOn();
    }

    @Override
    public void turnOff() {
        xiaomiSocket.powerOff();
    }

    @Override
    public String getStatus() {
        return xiaomiSocket.isPowered() ? "ON" : "OFF";
    }
}
