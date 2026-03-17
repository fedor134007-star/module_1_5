package org.example.stateEx;

public class NotConnect implements State {

    @Override
    public void setState() {
        IO.println("NotConnect");
    }
}

