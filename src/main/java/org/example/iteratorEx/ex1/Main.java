package org.example.iteratorEx.ex1;

import org.example.iteratorEx.ex1.iterator.Iterator;

public class Main {
    static void main() {
        String[] friends = {"vova", "lexa", "dima"};
        User user = new User("gleb", 12, friends);
        Iterator iterator = user.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
