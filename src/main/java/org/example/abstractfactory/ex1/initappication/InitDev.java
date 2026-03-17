package org.example.abstractfactory.ex1.initappication;

import org.example.abstractfactory.ex1.database.Database;
import org.example.abstractfactory.ex1.database.DevDatabase;
import org.example.abstractfactory.ex1.server.DevServer;
import org.example.abstractfactory.ex1.server.Server;

public class InitDev implements InitApplication {

    @Override
    public Database createDatabase() {
        return new DevDatabase();
    }

    @Override
    public Server createServer() {
        return new DevServer();
    }
}
