package org.example.flyweight.ex2.flyweight;

import org.example.flyweight.ex2.user.FavoriteUser;
import org.example.flyweight.ex2.user.OtherUser;
import org.example.flyweight.ex2.user.User;

import java.util.HashMap;
import java.util.Map;

public class UserFactory {
    private Map<String, User> mapUser = new HashMap<>();

    public User getUser(String key) {
        User user = mapUser.get(key);
        if (user == null) {
            switch (key) {
                case "other":
                    user = new OtherUser();
                    mapUser.put(key, user);
                    break;
                case "favorite":
                    user = new FavoriteUser();
                    mapUser.put(key, user);
                    break;
            }
        }
        return user;
    }

    public int getSize() {
        return mapUser.size();
    }
}
