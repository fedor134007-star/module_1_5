package org.example.commandEx.ex2;

public class StopCommand implements  Command {
    Car car;
    public StopCommand(Car car) {
        this.car = car;
    }
    @Override
    public void execute() {
        car.drive();
    }
}
