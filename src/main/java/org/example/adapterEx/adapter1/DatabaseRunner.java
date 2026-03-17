package org.example.adapterEx.adapter1;

public class DatabaseRunner {
    static void main() {
        Database database = new JavaAdapterToDatabase();
        database.create();
        database.update();
        database.delete();
    }
}
