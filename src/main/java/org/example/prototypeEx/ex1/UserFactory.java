package org.example.prototypeEx.ex1;

public class UserFactory {
    private User user;

    public UserFactory(User user) {
        this.user = user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User cloneUser() {
        return (User) user.copy();
    }
}
