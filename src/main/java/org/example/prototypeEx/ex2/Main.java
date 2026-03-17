package org.example.prototypeEx.ex2;

public class Main {
    static void main() {
        Notebook notebook = new Notebook("amd", "amd", "123");
        Notebook notebook2 = notebook.copy();

        IO.println(notebook);
        IO.println(notebook2);

        IO.println(notebook==notebook2);
    }
}
