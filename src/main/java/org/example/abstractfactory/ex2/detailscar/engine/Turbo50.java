package org.example.abstractfactory.ex2.detailscar.engine;

public class Turbo50 implements Engine{
    @Override
    public void startEngine() {
        IO.println("Turbo50 is starting");
    }
}
