package org.example.prototypeEx;

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
