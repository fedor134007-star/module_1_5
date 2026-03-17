package org.example.abstractfactory.ex1.server;

public class ProdServer implements Server{
    @Override
    public void getServer() {
        IO.println("ProdServer");
    }
}
