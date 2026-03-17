package org.example.composite.ex2.notification;

public class FavoriteFriend implements ChatNotification {
    private String name;

    public FavoriteFriend(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        IO.println(this.name + ": " + message);
    }
}
