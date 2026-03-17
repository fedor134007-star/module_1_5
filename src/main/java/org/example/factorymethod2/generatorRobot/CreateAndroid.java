package org.example.factorymethod2.generatorRobot;

import org.example.factorymethod2.robot.Android;

public class CreateAndroid extends GeneratorRobot {


    @Override
    public Android createRobot() {
        return new Android();
    }
}
