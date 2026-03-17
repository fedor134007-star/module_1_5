package org.example.builderEx.ex2.builder;

import org.example.builderEx.ex2.database.DatabaseSQL;

public abstract class BuilderDatabase {
    public abstract void createPort();

    public abstract void createHost();

    public abstract void createUser();

    public abstract void createPassword();

    public abstract DatabaseSQL createDatabase();
}
