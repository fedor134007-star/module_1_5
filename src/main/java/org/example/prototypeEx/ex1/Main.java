package org.example.prototypeEx.ex1;

public class Main {
    static void main() {
        User user = new User("admin", "admin@admin.admin", "password");
        User user2 = (User) user.copy();

        IO.println(user);
        IO.println(user2);

        UserFactory userFactory = new UserFactory(user);
        User user3 = userFactory.cloneUser();

        IO.println(user3);
    }
}
