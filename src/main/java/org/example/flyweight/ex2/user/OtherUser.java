package org.example.flyweight.ex2.user;

public class OtherUser implements User {
    @Override
    public void speak() {
        IO.println("OtherUser");
    }
}
