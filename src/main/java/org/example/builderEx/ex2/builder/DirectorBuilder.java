package org.example.builderEx.ex2.builder;

import org.example.builderEx.ex2.database.DatabaseSQL;

public class DirectorBuilder {
    BuilderDatabase builderDatabase;

    public DirectorBuilder(BuilderDatabase builderDatabase) {
        this.builderDatabase = builderDatabase;
    }

    public DatabaseSQL createDatabaseSQL() {
        builderDatabase.createHost();
        builderDatabase.createPort();
        builderDatabase.createPassword();
        builderDatabase.createUser();
        return builderDatabase.createDatabase();
    }
}
