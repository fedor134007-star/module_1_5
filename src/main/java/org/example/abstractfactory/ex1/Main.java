package org.example.abstractfactory.ex1;

import org.example.abstractfactory.ex1.database.Database;
import org.example.abstractfactory.ex1.initappication.InitApplication;
import org.example.abstractfactory.ex1.initappication.InitDev;
import org.example.abstractfactory.ex1.initappication.InitProd;
import org.example.abstractfactory.ex1.initappication.InitTest;
import org.example.abstractfactory.ex1.server.Server;

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
