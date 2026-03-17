package org.example.abstractfactory.server;

public class ProdServer implements Server{
    @Override
    public void getServer() {
        IO.println("ProdServer");
    }
}
