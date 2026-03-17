package org.example.adapterEx.adapter2;

import org.example.adapterEx.adapter2.adapters.PhilipsLightAdapter;
import org.example.adapterEx.adapter2.adapters.SamsungACAdapter;
import org.example.adapterEx.adapter2.adapters.XiaomiSocketAdapter;

public class Main {
    public static void main(String[] args) {
        SmartHomeSystem smartHome = new SmartHomeSystem();

        // Создаем устройства производителей
        PhilipsLight philipsLight = new PhilipsLight();
        XiaomiSocket xiaomiSocket = new XiaomiSocket();
        SamsungAC samsungAC = new SamsungAC();

        // Оборачиваем их в адаптеры
        smartHome.addDevice(new PhilipsLightAdapter(philipsLight));
        smartHome.addDevice(new XiaomiSocketAdapter(xiaomiSocket));
        smartHome.addDevice(new SamsungACAdapter(samsungAC));

        // Тестируем систему
        smartHome.showAllStatus();
        System.out.println("---");

        smartHome.turnAllOn();
        System.out.println("---");

        smartHome.showAllStatus();
        System.out.println("---");

        smartHome.turnAllOff();
        System.out.println("---");

        smartHome.showAllStatus();
    }
}