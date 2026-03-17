package org.example.abstractfactory.ex1.server;

public class DevServer implements Server{
    @Override
    public void getServer() {
        IO.println("DevServer");
    }
}
