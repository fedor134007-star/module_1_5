package org.example.chainofresponsibility.ex1.handler;

import org.example.chainofresponsibility.ex1.user.User;

public class AuthenticationHandler extends AccessHandler{

    @Override
    public boolean check(User user) {

        if(!user.isAuthenticated()){
            IO.println("Пользователь не авторизован");
            return false;
        }
        return true;
    }
}
