package org.example.memento.ex2;

import java.io.Serializable;

public class UserAccount {
    private String username;
    private int allMoney;


    public UserAccount(String username, int allMoney) {
        this.username = username;
        this.allMoney = allMoney;
    }

    public void addMoney(int money) {
        allMoney = allMoney + money;
    }

    public void minusMoney(int money) {
        allMoney = allMoney - money;
    }

    public Memento saveAccount() {
        return new Memento(this.username, this.allMoney);
    }

    public void getAccount(Memento memento) {
        this.username = memento.getUsername();
        this.allMoney = memento.getAllMoney();
    }


    public static class Memento {
        private String username;
        private int allMoney;

        private Memento(String username, int allMoney) {
            this.username = username;
            this.allMoney = allMoney;
        }

        private String getUsername() {
            return username;
        }

        private int getAllMoney() {
            return allMoney;
        }
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "username='" + username + '\'' +
                ", allMoney=" + allMoney +
                '}';
    }
}
