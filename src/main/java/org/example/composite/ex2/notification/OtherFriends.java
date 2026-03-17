package org.example.composite.ex2.notification;

public class OtherFriends implements ChatNotification {

    private String name;

    public OtherFriends(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        IO.println(this.name + ": " + message);
    }
}
