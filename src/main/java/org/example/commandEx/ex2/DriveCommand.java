package org.example.commandEx.ex2;

public class DriveCommand implements Command {
    Car car;
    public DriveCommand(Car car) {
        this.car = car;
    }
    @Override
    public void execute() {
        car.drive();
    }
}
