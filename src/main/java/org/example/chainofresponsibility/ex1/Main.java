package org.example.chainofresponsibility.ex1;

import org.example.chainofresponsibility.ex1.handler.AuthenticationHandler;
import org.example.chainofresponsibility.ex1.handler.PermissionHandler;
import org.example.chainofresponsibility.ex1.handler.RoleHandler;
import org.example.chainofresponsibility.ex1.user.User;

public class Main {
    public static void main(String[] args) {
        AuthenticationHandler authenticationHandler = new AuthenticationHandler();
        RoleHandler roleHandler = new RoleHandler();
        PermissionHandler permissionHandler = new PermissionHandler();

        authenticationHandler.setNext(roleHandler);
        roleHandler.setNext(permissionHandler);


        IO.println("Test user1");
        User user = new User("admin", true, "read");
        authenticationHandler.handle(user);

        IO.println("Test user2");
        User user2 = new User("admins", true, "read");
        authenticationHandler.handle(user2);

        IO.println("Test user3");
        User user3 = new User("admin", true, "write");
        authenticationHandler.handle(user3);

        IO.println("Test user4");
        User user4 = new User("admin", false, "read");
        authenticationHandler.handle(user4);

    }

}
