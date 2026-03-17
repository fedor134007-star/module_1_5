package org.example.adapterEx.adapter2.adapters;

import org.example.adapterEx.adapter2.SamsungAC;
import org.example.adapterEx.adapter2.SmartDevice;

public class SamsungACAdapter implements SmartDevice {

    SamsungAC samsungAC;

    public SamsungACAdapter(SamsungAC samsungAC) {
        this.samsungAC = samsungAC;
    }

    @Override
    public void turnOn() {
        samsungAC.setPower(true);
    }

    @Override
    public void turnOff() {
        samsungAC.setPower(false);
    }

    @Override
    public String getStatus() {
        return samsungAC.getPower() ? "ON" : "OFF";
    }
}
