package org.example.templatemethodEx.ex2;

public class Main {
    static void main() {
        LiteSql liteSql = new LiteSql();
        liteSql.templateDelete("asda");

        DriftDB driftDB = new DriftDB();
        driftDB.templateDelete("asdsada");
    }
}
