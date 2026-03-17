package org.example.iteratorEx.ex2;

import org.example.iteratorEx.ex2.iterator.Iterator;
import org.example.iteratorEx.ex2.iterator.ShoppingList;

import java.util.ArrayList;
import java.util.List;

public class MyShoppingList implements ShoppingList<String> {
    List<String> shoppingList = new ArrayList<>();

    @Override
    public void addItem(String item) {
        shoppingList.add(item);
    }

    @Override
    public Iterator<String> createIterator() {
        return new ShoppingListIterator();
    }

    private class ShoppingListIterator implements Iterator<String> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < shoppingList.size();
        }

        @Override
        public String next() {
            return shoppingList.get(index++);
        }
    }
}
