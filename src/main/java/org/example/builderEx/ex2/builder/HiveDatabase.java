package org.example.builderEx.ex2.builder;

import org.example.builderEx.ex2.database.DatabaseSQL;

public class HiveDatabase extends BuilderDatabase {

    private String port;
    private String host;
    private String user;
    private String password;

    @Override
    public void createPort() {
        this.port = "9090";
    }

    @Override
    public void createHost() {
        this.host = "localhost";
    }

    @Override
    public void createUser() {
        this.user = "user";
    }

    @Override
    public void createPassword() {
        this.password = "password";
    }

    @Override
    public DatabaseSQL createDatabase() {
        return new DatabaseSQL(port, host, user, password);
    }
}
