package org.example.chainofresponsibility.ex1.handler;

import org.example.chainofresponsibility.ex1.user.User;

public class PermissionHandler extends AccessHandler {

    @Override
    public boolean check(User user) {
        if (user.getPermissions().equals("read")) {
            return true;
        } else {
            IO.println("Ошибка: пользователь не имеет доступ на чтение");
            return false;
        }
    }
}
