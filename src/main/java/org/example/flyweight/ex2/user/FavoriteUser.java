package org.example.flyweight.ex2.user;

public class FavoriteUser implements User {
    @Override
    public void speak() {
        IO.println("FavoriteUser");
    }
}
