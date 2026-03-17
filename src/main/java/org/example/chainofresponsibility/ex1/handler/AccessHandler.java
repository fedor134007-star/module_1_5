package org.example.chainofresponsibility.ex1.handler;

import org.example.chainofresponsibility.ex1.user.User;

public abstract class AccessHandler {
    protected AccessHandler next;

    public void setNext(AccessHandler next) {
        this.next = next;
    }


    public void handle(User user) {
        if (check(user)) {
            if (next != null) {
                next.handle(user);
            }else {
                System.out.println("Доступ разрешен.");
            }
        }
    }


    public abstract boolean check(User user);
}
