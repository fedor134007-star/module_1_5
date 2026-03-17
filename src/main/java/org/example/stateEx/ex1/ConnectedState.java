package org.example.stateEx.ex1;

public class ConnectedState implements State {

    @Override
    public void setState() {
        IO.println("ConnectedState");
    }
}
