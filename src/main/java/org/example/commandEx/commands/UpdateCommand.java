package org.example.commandEx.commands;

import org.example.commandEx.database.Database;

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
