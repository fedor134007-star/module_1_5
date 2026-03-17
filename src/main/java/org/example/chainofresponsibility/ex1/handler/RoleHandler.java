package org.example.chainofresponsibility.ex1.handler;

import org.example.chainofresponsibility.ex1.user.User;

public class RoleHandler extends AccessHandler {

    @Override
    public boolean check(User user) {
        if (!(user.getRole().equals("admin") || user.getRole().equals("user"))) {
            IO.println("Ошибка: пользователь не имеет роли");
            return false;
        }
        return true;
    }
}
