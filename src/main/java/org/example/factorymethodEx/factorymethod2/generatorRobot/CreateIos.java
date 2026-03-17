package org.example.factorymethodEx.factorymethod2.generatorRobot;

import org.example.factorymethodEx.factorymethod2.robot.Ios;

public class CreateIos extends GeneratorRobot {

    @Override
    public Ios createRobot() {
        return new Ios();
    }
}
