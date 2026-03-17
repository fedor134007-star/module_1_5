package org.example.iteratorEx.ex4.user;

import org.example.iteratorEx.ex4.iterator.Iterator;
import org.example.iteratorEx.ex4.iterator.ListUser;

import java.util.*;

public class MyUserList implements ListUser {
    private List<User> userList = new ArrayList<>();
    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public Iterator<User> createIterator() {
        return new UserIterator();
    }


    private class UserIterator implements Iterator<User> {
       int index = 0;
        @Override
        public boolean hasNext() {
            return index < userList.size();
        }

        @Override
        public User next() {
            return userList.get(index++);
        }
    }
}
