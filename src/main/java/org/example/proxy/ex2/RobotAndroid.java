package org.example.proxy.ex2;

public class RobotAndroid implements Robot {
    @Override
    public void checkRobot() {
        IO.println("Robot check robot");
    }

    @Override
    public void work() {
        IO.println("I am RobotAndroid");
    }
}
