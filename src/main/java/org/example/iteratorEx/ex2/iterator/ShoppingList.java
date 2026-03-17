package org.example.iteratorEx.ex2.iterator;

public interface ShoppingList<T> {
    public void addItem(T item);
    public Iterator createIterator();
}
