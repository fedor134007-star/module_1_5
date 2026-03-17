package org.example.mediatorEx.ex1;

import org.example.mediatorEx.ex1.mediator.ChatMediator;
import org.example.mediatorEx.ex1.mediator.ChatRoom;

public class Main {
    static void main() {
        ChatMediator chatMediator = new ChatRoom();
        User user1 = new User("Vova", chatMediator);
        User user2 = new User("Gala", chatMediator);
        User user3 = new User("Gena", chatMediator);
        User user4 = new User("Rop", chatMediator);
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.sendMessage("Привет всем ");
        user2.sendMessage("Привет вова");
    }
}
