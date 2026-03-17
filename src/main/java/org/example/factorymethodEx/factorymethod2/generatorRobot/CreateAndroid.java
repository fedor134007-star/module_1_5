package org.example.factorymethodEx.factorymethod2.generatorRobot;

import org.example.factorymethodEx.factorymethod2.robot.Android;

public class CreateAndroid extends GeneratorRobot {


    @Override
    public Android createRobot() {
        return new Android();
    }
}
