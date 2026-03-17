package org.example.commandEx.ex2;

public class Main {
    static void main() {
        Car car = new Car();
        Command drive = new DriveCommand(car);
        Command stop = new StopCommand(car);
        drive.execute();
        stop.execute();
    }
}
