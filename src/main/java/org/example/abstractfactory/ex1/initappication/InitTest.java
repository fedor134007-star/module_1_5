package org.example.abstractfactory.ex1.initappication;

import org.example.abstractfactory.ex1.database.Database;
import org.example.abstractfactory.ex1.database.TestDatabase;
import org.example.abstractfactory.ex1.server.Server;
import org.example.abstractfactory.ex1.server.TestServer;

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
