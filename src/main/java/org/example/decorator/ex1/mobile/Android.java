package org.example.decorator.ex1.mobile;


public class Android extends Mobile {

    public Android(String name) {
        super(name);
    }


    @Override
    public void call() {
        IO.println("Android call...");
    }

    @Override
    public void sendMessage() {
        IO.println("Android send message...");
    }
}
