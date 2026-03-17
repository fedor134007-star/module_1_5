package org.example.stateEx;

public class ConnectedState implements State {

    @Override
    public void setState() {
        IO.println("ConnectedState");
    }
}
