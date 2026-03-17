package org.example.factorymethodEx.factorymethod2.robot;

public class Aurora implements Robot {
    @Override
    public void signal() {
        IO.println("im Aurora");
    }
}
