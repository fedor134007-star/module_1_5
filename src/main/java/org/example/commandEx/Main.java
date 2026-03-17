package org.example.commandEx;

import org.example.commandEx.commands.Command;
import org.example.commandEx.commands.DeleteCommand;
import org.example.commandEx.commands.InsertCommand;
import org.example.commandEx.commands.UpdateCommand;
import org.example.commandEx.database.Database;
import org.example.commandEx.service.DatabaseService;

public class Main {
    static void main() {
        Database database = new Database();
        Command insert =  new InsertCommand(database);
        Command update =  new UpdateCommand(database);
        Command delete = new DeleteCommand(database);
        DatabaseService service = new DatabaseService(insert, update, delete);
        service.insert();
        service.update();
        service.delete();

        Database database2 = new Database();
        Command insert2 =  new InsertCommand(database2);
        Command update2 =  new UpdateCommand(database2);
        Command delete2 = new DeleteCommand(database2);
        DatabaseService service2 = new DatabaseService(insert2, update2, delete2);

        service2.insert();
        service2.update();
        service2.delete();

    }
}
