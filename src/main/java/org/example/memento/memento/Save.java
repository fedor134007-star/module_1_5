package org.example.memento.memento;

import java.util.Date;

public class Save {
    private final String userName;
    private final String password;
    private final Date date;

    public Save(String userName, String password,  Date date) {
        this.userName = userName;
        this.password = password;
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Date getDate() {
        return date;
    }
}
