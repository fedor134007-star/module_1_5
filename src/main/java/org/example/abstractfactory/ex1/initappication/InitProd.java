package org.example.abstractfactory.ex1.initappication;

import org.example.abstractfactory.ex1.database.Database;
import org.example.abstractfactory.ex1.database.ProdDatabase;
import org.example.abstractfactory.ex1.server.ProdServer;
import org.example.abstractfactory.ex1.server.Server;

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
