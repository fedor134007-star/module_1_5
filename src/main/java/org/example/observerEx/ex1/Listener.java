package org.example.observerEx.ex1;

public class Listener implements Observer {

    @Override
    public void update(boolean stateServiceMode) {
        if (stateServiceMode) {
            IO.println("Service mode ON");
        } else {
            IO.println("Service mode OFF");
        }
    }
}
