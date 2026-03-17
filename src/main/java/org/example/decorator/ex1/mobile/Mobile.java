package org.example.decorator.ex1.mobile;

public abstract class Mobile {

    public String name;

    public Mobile(String name) {
        this.name = name;
    }

    public abstract void call();

    public abstract void sendMessage();
}
