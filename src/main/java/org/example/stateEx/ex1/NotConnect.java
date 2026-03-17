package org.example.stateEx.ex1;

public class NotConnect implements State {

    @Override
    public void setState() {
        IO.println("NotConnect");
    }
}

