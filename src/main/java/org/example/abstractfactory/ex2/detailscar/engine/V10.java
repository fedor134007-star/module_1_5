package org.example.abstractfactory.ex2.detailscar.engine;

public class V10 implements Engine {
    @Override
    public void startEngine() {
        IO.println("V10 is starting");
    }
}
