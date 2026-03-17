package org.example.factorymethod2;

import org.example.factorymethod2.generatorRobot.CreateAndroid;
import org.example.factorymethod2.generatorRobot.CreateAurora;
import org.example.factorymethod2.generatorRobot.CreateIos;
import org.example.factorymethod2.generatorRobot.GeneratorRobot;
import org.example.factorymethod2.robot.Robot;

public class main {
    public static void main(String[] args) {
        GeneratorRobot createAndroid = generatorRobot("Android");
        Robot android = createAndroid.createRobot();
        android.signal();

        GeneratorRobot createIos = generatorRobot("Ios");
        Robot ios = createIos.createRobot();
        ios.signal();

        GeneratorRobot createAurora = generatorRobot("Aurora");
        Robot aurora = createAurora.createRobot();
        aurora.signal();
    }

    static GeneratorRobot generatorRobot(String name) {
        switch (name) {
            case "Android":
                return new CreateAndroid();
            case "Ios":
                return new CreateIos();
            case "Aurora":
                return new CreateAurora();
            default:
                return null;
        }

    }
}
