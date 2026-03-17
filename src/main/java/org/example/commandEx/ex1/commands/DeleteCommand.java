package org.example.commandEx.ex1.commands;

import org.example.commandEx.ex1.database.Database;

public class DeleteCommand implements Command {
    private Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
