package org.example.factorymethod2.generatorRobot;

import org.example.factorymethod2.robot.Aurora;

public class CreateAurora extends GeneratorRobot {

    @Override
    public Aurora createRobot() {
        return new Aurora();
    }
}
