package org.example.facade.api;

public class ApiImpl implements Api {
    @Override
    public void sendAction() {
        IO.println("Sending action...");
    }
}
