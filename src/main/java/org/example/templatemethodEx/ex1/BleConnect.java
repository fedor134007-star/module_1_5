package org.example.templatemethodEx.ex1;

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
