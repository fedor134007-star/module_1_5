package org.example.memento;

import org.example.memento.memento.Save;

import java.util.Date;

public class User {
    private String username;
    private String password;
    private Date createDate;

    public void setUser(String username, String password) {
        this.username = username;
        this.password = password;
        this.createDate = new Date();
    }

    public Save save(){
        return new Save(username, password, createDate);
    }

    public void load(Save save){
        username = save.getUserName();
        password = save.getPassword();
        createDate = save.getDate();
    }

    @Override
    public String toString() {
        return "User \n" +
                "\nusername=" + username +
                "\npassword=" + password +
                "\ncreateDate=" + createDate
                ;
    }
}
