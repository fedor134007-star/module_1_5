package org.example.adapterEx.adapter2;

public class XiaomiSocket {
    private boolean powered = false;

    public void powerOn() {
        powered = true;
        System.out.println("Xiaomi: Розетка включена");
    }

    public void powerOff() {
        powered = false;
        System.out.println("Xiaomi: Розетка выключена");
    }

    public boolean isPowered() {
        return powered;
    }
}
