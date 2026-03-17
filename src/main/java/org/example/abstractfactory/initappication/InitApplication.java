package org.example.abstractfactory.initappication;

import org.example.abstractfactory.database.Database;
import org.example.abstractfactory.server.Server;

public interface InitApplication {
    Database createDatabase();
    Server createServer();
}
