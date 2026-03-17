package org.example.factorymethod2.robot;

public class Android implements Robot {
    @Override
    public void signal() {
        IO.println("im Android");
    }
}
