package org.example.factorymethod2.generatorRobot;

import org.example.factorymethod2.robot.Ios;

public class CreateIos extends GeneratorRobot {

    @Override
    public Ios createRobot() {
        return new Ios();
    }
}
