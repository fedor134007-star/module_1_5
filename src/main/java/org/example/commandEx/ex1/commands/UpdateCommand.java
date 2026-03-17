package org.example.commandEx.ex1.commands;

import org.example.commandEx.ex1.database.Database;

public class UpdateCommand implements Command {
    private Database database;
    public UpdateCommand(Database database) {
        this.database = database;
    }
    @Override
    public void execute() {
        database.update();
    }
}
