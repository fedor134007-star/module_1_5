package org.example.stateEx;

public class ConnectingState implements State {

    @Override
    public void setState() {
        IO.println("ConnectingState");
    }
}
