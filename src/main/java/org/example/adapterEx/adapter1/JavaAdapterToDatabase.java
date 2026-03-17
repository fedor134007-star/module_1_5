package org.example.adapterEx.adapter1;

public class JavaAdapterToDatabase extends JavaApplication implements Database {

    @Override
    public void create() {
        createObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
