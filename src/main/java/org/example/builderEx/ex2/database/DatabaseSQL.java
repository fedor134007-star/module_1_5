package org.example.builderEx.ex2.database;

public class DatabaseSQL {
    private String port;
    private String host;
    private String user;
    private String password;

    public DatabaseSQL(String port, String host, String user, String password) {
        this.port = port;
        this.host = host;
        this.user = user;
        this.password = password;
    }


    @Override
    public String toString() {
        return "DatabaseSQL{" +
                "port='" + port + '\'' +
                ", host='" + host + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
