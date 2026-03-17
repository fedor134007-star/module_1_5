package org.example.memento;

import org.example.memento.memento.UserRepo;

public class Main {

    static void main() throws InterruptedException {
        User user = new User();
        IO.println(user.toString());
        UserRepo userRepo = new UserRepo();

        IO.println("создаем пользователя");
        user.setUser("vava", "password");
        userRepo.setSave(user.save());
        IO.println(user.toString());

        IO.println("ломаем пользователя");
        user.setUser("", "");
        IO.println(user.toString());

        Thread.sleep(2000);

        IO.println("возвращаем пользователя");
        user.load(userRepo.getSave());
        IO.println(user.toString());


    }
}
