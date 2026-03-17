package org.example.factorymethodEx.factorymethod3;

import org.example.factorymethodEx.factorymethod3.bleservice.Ble;
import org.example.factorymethodEx.factorymethod3.bleservice.RadioBle;
import org.example.factorymethodEx.factorymethod3.bleservice.TVBle;

public class Main {
    static void main() {
        Ble ble = createDevice("Radio");
        ble.createDevice();
        ble.connect();

        Ble ble2 = createDevice("TV");
        ble2.createDevice();
        ble2.connect();
    }


    static Ble createDevice(String name) {
        return switch (name) {
            case "Radio" -> new RadioBle();
            case "TV" -> new TVBle();
            default -> new RadioBle();
        };
    }
}
