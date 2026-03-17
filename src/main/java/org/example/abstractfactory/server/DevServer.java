package org.example.abstractfactory.server;

public class DevServer implements Server{
    @Override
    public void getServer() {
        IO.println("DevServer");
    }
}
