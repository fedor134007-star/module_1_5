package org.example.mediatorEx.ex1;

import org.example.mediatorEx.ex1.mediator.ChatMediator;

public class User {
    String name;
    ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String message) {
        chatMediator.sendMessage(message, this);
    }

    public void receive(String message) {
        IO.println(name + " получил " + message);
    }
}
