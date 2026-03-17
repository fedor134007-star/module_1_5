package org.example.abstractfactory.server;

public class TestServer implements Server{
    @Override
    public void getServer() {
        IO.println("TestServer");
    }
}
