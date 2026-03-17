package org.example.chainofresponsibility.ex1.user;

public class User {
    private String role;
    private boolean authenticated;
    private String permissions;

    public User(String role, boolean authenticated, String permissions) {
        this.role = role;
        this.authenticated = authenticated;
        this.permissions = permissions;
    }

    public String getRole() {
        return role;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public String getPermissions() {
        return permissions;
    }
}
