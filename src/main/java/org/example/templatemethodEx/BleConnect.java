package org.example.templatemethodEx;

public class BleConnect extends TemplateMethod {

    @Override
    public void connect() {
        IO.println("BleConnect");
    }

    @Override
    public void getAction() {
        IO.println("BleConnect getAction");
    }
}
