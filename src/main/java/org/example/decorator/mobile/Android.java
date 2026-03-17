package org.example.decorator.mobile;


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
