package org.example.commandEx.service;

import org.example.commandEx.commands.Command;

public class DatabaseService {
    private Command insert;
    private Command update;
    private Command delete;


    public DatabaseService(Command insert, Command update, Command delete) {
        this.insert = insert;
        this.update = update;
        this.delete = delete;
    }

    public void insert() {
        insert.execute();
    }

    public void update() {
        update.execute();
    }

    public void delete() {
        delete.execute();
    }
}
