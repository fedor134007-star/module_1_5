package org.example.composite.ex2;

import org.example.composite.ex2.notification.ChatNotification;
import org.example.composite.ex2.notification.FavoriteFriend;
import org.example.composite.ex2.notification.GroupNotification;
import org.example.composite.ex2.notification.OtherFriends;

public class Main {
    static void main() {
        ChatNotification friend1 = new FavoriteFriend("FavoriteFriend friend1");
        ChatNotification friend2 = new FavoriteFriend("FavoriteFriend friend2");
        ChatNotification friend3 = new FavoriteFriend("FavoriteFriend friend3");
        ChatNotification friend4 = new FavoriteFriend("FavoriteFriend friend4");

        ChatNotification friend5 = new OtherFriends("OtherFriends friend5");
        ChatNotification friend6 = new OtherFriends("OtherFriends friend6");
        ChatNotification friend7 = new OtherFriends("OtherFriends friend7");
        ChatNotification friend8 = new OtherFriends("OtherFriends friend8");


        GroupNotification notification =  new GroupNotification();
        notification.addFriend(friend1);
        notification.addFriend(friend2);
        notification.addFriend(friend3);
        notification.addFriend(friend4);
        notification.addFriend(friend5);
        notification.addFriend(friend6);
        notification.addFriend(friend7);
        notification.addFriend(friend8);

        notification.sendMessage("Я тут 2 дня работаю и ни чего не ел");
    }
}
