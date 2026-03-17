package org.example.abstractfactory.ex1.server;

public class TestServer implements Server{
    @Override
    public void getServer() {
        IO.println("TestServer");
    }
}
