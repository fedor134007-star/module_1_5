package org.example.abstractfactory.ex1.initappication;

import org.example.abstractfactory.ex1.database.Database;
import org.example.abstractfactory.ex1.server.Server;

public interface InitApplication {
    Database createDatabase();
    Server createServer();
}
