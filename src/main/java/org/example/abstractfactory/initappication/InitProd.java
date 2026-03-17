package org.example.abstractfactory.initappication;

import org.example.abstractfactory.database.Database;
import org.example.abstractfactory.database.ProdDatabase;
import org.example.abstractfactory.server.ProdServer;
import org.example.abstractfactory.server.Server;

public class InitProd implements InitApplication{

    @Override
    public Database createDatabase() {
        return new ProdDatabase();
    }

    @Override
    public Server createServer() {
        return new ProdServer();
    }
}
