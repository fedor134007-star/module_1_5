package org.example.stateEx.ex1;

public class ConnectingState implements State {

    @Override
    public void setState() {
        IO.println("ConnectingState");
    }
}
