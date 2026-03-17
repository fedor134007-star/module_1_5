package org.example.iteratorEx.ex1;

import org.example.iteratorEx.ex1.iterator.Collection;
import org.example.iteratorEx.ex1.iterator.Iterator;

public class User implements Collection {
    private String name;
    private int age;
    private String[] friends;

    public User(String name, int age, String[] friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }


    @Override
    public Iterator getIterator() {
        return new UserIterator();
    }


    private class  UserIterator implements Iterator {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < friends.length;
        }

        @Override
        public Object next() {
            return friends[index++];
        }
    }
}
