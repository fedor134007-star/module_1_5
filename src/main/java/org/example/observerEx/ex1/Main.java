package org.example.observerEx.ex1;

public class Main {
    static void main() {
        ServiceMode serviceMode = new ServiceMode();
        Listener listener1 = new Listener();
        Listener listener2 = new Listener();

        serviceMode.addObserver(listener1);
        serviceMode.activateServiceMode();

        serviceMode.addObserver(listener2);
        serviceMode.deactivateServiceMode();
    }
}
