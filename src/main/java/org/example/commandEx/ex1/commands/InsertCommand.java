package org.example.commandEx.ex1.commands;


import org.example.commandEx.ex1.database.Database;

public class InsertCommand implements Command {
    private Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
