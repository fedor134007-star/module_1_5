package org.example.abstractfactory.initappication;

import org.example.abstractfactory.database.Database;
import org.example.abstractfactory.database.DevDatabase;
import org.example.abstractfactory.server.DevServer;
import org.example.abstractfactory.server.Server;

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
