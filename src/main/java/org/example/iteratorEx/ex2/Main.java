package org.example.iteratorEx.ex2;

import org.example.iteratorEx.ex2.iterator.Iterator;

public class Main {

    static void main() {
        MyShoppingList shoppingList = new MyShoppingList();
        shoppingList.addItem("Картошка");
        shoppingList.addItem("Арбуз");
        shoppingList.addItem("Килька");
        shoppingList.addItem("Селедка");
        shoppingList.addItem("Молоко");

        Iterator<String> iterator = shoppingList.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
