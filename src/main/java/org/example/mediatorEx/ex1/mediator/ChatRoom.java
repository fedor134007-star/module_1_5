package org.example.mediatorEx.ex1.mediator;

import org.example.mediatorEx.ex1.User;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    List<User> userList = new ArrayList<>();


    @Override
    public void sendMessage(String message, User userSender) {
        for (User user : userList) {
            if (user != userSender) {
                user.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}
