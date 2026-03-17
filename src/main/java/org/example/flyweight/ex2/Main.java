package org.example.flyweight.ex2;

import org.example.flyweight.ex2.flyweight.UserFactory;
import org.example.flyweight.ex2.user.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        UserFactory userFactory = new UserFactory();

        list.add(userFactory.getUser("favorite"));
        list.add(userFactory.getUser("favorite"));
        list.add(userFactory.getUser("favorite"));
        list.add(userFactory.getUser("favorite"));
        list.add(userFactory.getUser("favorite"));
        list.add(userFactory.getUser("favorite"));
        list.add(userFactory.getUser("favorite"));
        list.add(userFactory.getUser("favorite"));

        list.add(userFactory.getUser("other"));
        list.add(userFactory.getUser("other"));
        list.add(userFactory.getUser("other"));
        list.add(userFactory.getUser("other"));
        list.add(userFactory.getUser("other"));
        list.add(userFactory.getUser("other"));
        list.add(userFactory.getUser("other"));


        list.forEach(User::speak);
        IO.println(userFactory.getSize());

    }
}
