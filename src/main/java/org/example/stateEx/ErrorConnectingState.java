package org.example.stateEx;

public class ErrorConnectingState implements State {

    @Override
    public void setState() {
        IO.println("ErrorConnectingState");
    }
}
