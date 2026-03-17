package org.example.templatemethodEx.ex1;

public class ApiConnect extends TemplateMethod {
    @Override
    public void connect() {
        IO.println("ApiConnect Api connect");
    }

    @Override
    public void getAction() {
        IO.println("ApiConnect getAction");
    }
}
