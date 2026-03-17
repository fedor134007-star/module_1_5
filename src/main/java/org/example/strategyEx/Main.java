package org.example.strategyEx;


public class Main {
    static void main() {
        ServiceMode serviceMode = new ServiceMode();
        serviceMode.getStrategy();
        IO.println("//////////////////////////////");

        serviceMode.setStrategy(new RequestServiceMode());
        serviceMode.getStrategy();
        serviceMode.runMethod();
        IO.println("//////////////////////////////");

        serviceMode.setStrategy(new AcceptServiceMode());
        serviceMode.runMethod();
        IO.println("//////////////////////////////");

        serviceMode.setStrategy(new RejectServiceMode());
        serviceMode.runMethod();
    }
}
