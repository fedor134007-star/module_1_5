package org.example.adapterEx.adapter2.adapters;

import org.example.adapterEx.adapter2.PhilipsLight;
import org.example.adapterEx.adapter2.SmartDevice;

public class PhilipsLightAdapter implements SmartDevice {
    PhilipsLight philipsLight;

    public PhilipsLightAdapter(PhilipsLight philipsLight) {
        this.philipsLight = philipsLight;
    }

    @Override
    public void turnOn() {
        philipsLight.turnOnLight();
    }

    @Override
    public void turnOff() {
        philipsLight.turnOffLight();
    }

    @Override
    public String getStatus() {
        return philipsLight.isLightOn() ? "ON" : "OFF";
    }
}
