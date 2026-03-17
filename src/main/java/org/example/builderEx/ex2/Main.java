package org.example.builderEx.ex2;

import org.example.builderEx.ex2.builder.DirectorBuilder;
import org.example.builderEx.ex2.builder.HiveDatabase;
import org.example.builderEx.ex2.builder.PostgresDatabase;
import org.example.builderEx.ex2.database.DatabaseSQL;

public class Main {

    static void main() {

        DirectorBuilder builder = new DirectorBuilder(new HiveDatabase());
        DatabaseSQL databaseHive = builder.createDatabaseSQL();
        IO.println(databaseHive.toString());

        DirectorBuilder builder2 = new DirectorBuilder(new PostgresDatabase());
        DatabaseSQL databaseSQL = builder2.createDatabaseSQL();
        IO.println(databaseSQL.toString());
    }
}
