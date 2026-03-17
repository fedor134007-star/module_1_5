package org.example.factorymethodEx.factorymethod2.generatorRobot;

import org.example.factorymethodEx.factorymethod2.robot.Aurora;

public class CreateAurora extends GeneratorRobot {

    @Override
    public Aurora createRobot() {
        return new Aurora();
    }
}
