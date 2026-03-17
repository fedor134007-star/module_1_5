package org.example.factorymethodEx.factorymethod2.robot;

public class Ios implements Robot {
    @Override
    public void signal() {
        IO.println("im ios");
    }
}
