package org.example.iteratorEx.ex4;

import org.example.iteratorEx.ex4.iterator.Iterator;
import org.example.iteratorEx.ex4.user.MyUserList;
import org.example.iteratorEx.ex4.user.User;

public class Main {
    static void main() {
        MyUserList myUserList = new MyUserList();
        myUserList.addUser(new User());
        myUserList.addUser(new User());
        myUserList.addUser(new User());
        myUserList.addUser(new User());
        myUserList.addUser(new User());
        myUserList.addUser(new User());

        Iterator<User> iterator = myUserList.createIterator();
        while (iterator.hasNext()){
           User user =iterator.next();
           IO.println(user);
        }
    }
}
