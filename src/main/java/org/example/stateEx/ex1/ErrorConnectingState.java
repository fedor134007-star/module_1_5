package org.example.stateEx.ex1;

public class ErrorConnectingState implements State {

    @Override
    public void setState() {
        IO.println("ErrorConnectingState");
    }
}
