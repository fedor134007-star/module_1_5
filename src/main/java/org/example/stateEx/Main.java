package org.example.stateEx;

public class Main {

    static void main() throws InterruptedException {
        BleDevice bleDevice = new BleDevice();

        IO.println(bleDevice.getState());

        bleDevice.connect(1);

    }


}
