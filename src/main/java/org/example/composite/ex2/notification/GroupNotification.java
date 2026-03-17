package org.example.composite.ex2.notification;

import java.util.ArrayList;
import java.util.List;

public class GroupNotification implements ChatNotification {
    private List<ChatNotification> allFriends = new ArrayList<>();

    public void addFriend(ChatNotification friend) {
        allFriends.add(friend);
    }

    public void removeFriend(ChatNotification friend) {
        allFriends.remove(friend);
    }

    @Override
    public void sendMessage(String message) {
        for (ChatNotification friend : allFriends) {
            friend.sendMessage(message);
        }
    }
}
