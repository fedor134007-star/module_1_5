package org.example.builderEx.ex2.builder;

import org.example.builderEx.ex2.database.DatabaseSQL;

public class PostgresDatabase extends BuilderDatabase {
    private String port;
    private String host;
    private String user;
    private String password;

    @Override
    public void createPort() {
        this.port = "5432";
    }

    @Override
    public void createHost() {
        this.host = "localhost";
    }

    @Override
    public void createUser() {
        this.user = "postgres";
    }

    @Override
    public void createPassword() {
        this.password = "postgres";
    }

    @Override
    public DatabaseSQL createDatabase() {
        return new DatabaseSQL(this.port, this.host, this.user, this.password);
    }
}
