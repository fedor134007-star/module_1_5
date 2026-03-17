package org.example.abstractfactory.ex2.detailscar.transmission;

public class Manual implements Transmission {
    @Override
    public void startTransmission() {
        IO.println("Manual is starting");
    }
}
