package org.example.abstractfactory.initappication;

import org.example.abstractfactory.database.Database;
import org.example.abstractfactory.database.TestDatabase;
import org.example.abstractfactory.server.Server;
import org.example.abstractfactory.server.TestServer;

public class InitTest implements InitApplication {
    @Override
    public Database createDatabase() {
        return new TestDatabase();
    }

    @Override
    public Server createServer() {
        return new TestServer();
    }
}
