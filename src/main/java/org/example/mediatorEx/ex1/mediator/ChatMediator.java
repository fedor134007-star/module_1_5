package org.example.mediatorEx.ex1.mediator;

import org.example.mediatorEx.ex1.User;

public interface ChatMediator {
    void sendMessage(String message, User user);

    void addUser(User user);
}
