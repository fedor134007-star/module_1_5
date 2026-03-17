package org.example.abstractfactory.ex2.detailscar.transmission;

public class Automatic implements Transmission {
    @Override
    public void startTransmission() {
        IO.println("Automatic is starting");
    }
}
