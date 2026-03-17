package org.example.iteratorEx.ex4.iterator;

import org.example.iteratorEx.ex4.user.User;

public interface ListUser {
    void addUser(User user);
    Iterator<User> createIterator();
}
