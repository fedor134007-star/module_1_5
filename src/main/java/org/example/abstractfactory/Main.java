package org.example.abstractfactory;

import org.example.abstractfactory.database.Database;
import org.example.abstractfactory.initappication.InitApplication;
import org.example.abstractfactory.initappication.InitDev;
import org.example.abstractfactory.initappication.InitProd;
import org.example.abstractfactory.initappication.InitTest;
import org.example.abstractfactory.server.Server;

public class Main {
    static void main() {
        InitApplication initTest = new InitTest();
        Server server = initTest.createServer();
        Database database = initTest.createDatabase();
        server.getServer();
        database.getNameDatabase();


        InitApplication initDev = new InitDev();
        Server serverDev = initTest.createServer();
        Database databaseDev = initTest.createDatabase();
        serverDev.getServer();
        databaseDev.getNameDatabase();


        InitApplication initProd = new InitProd();
        Server serverProd = initTest.createServer();
        Database databaseProd = initTest.createDatabase();
        serverProd.getServer();
        databaseProd.getNameDatabase();
    }
}
