package org.example.decorator.mobile;

public abstract class Mobile {

    public String name;

    public Mobile(String name) {
        this.name = name;
    }

    public abstract void call();

    public abstract void sendMessage();
}
