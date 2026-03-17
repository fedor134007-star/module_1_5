package org.example.decorator.ex1.mobile;

public class Iphone extends Mobile {

    public Iphone(String name) {
        super(name);
    }

    @Override
    public void call() {
        IO.println("Iphone call...");
    }

    @Override
    public void sendMessage() {
        IO.println("Iphone send message...");
    }
}
