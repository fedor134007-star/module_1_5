package org.example.memento.ex2;

import java.util.Stack;

public class History {
    private Stack<UserAccount.Memento> history = new Stack<>();

    public void saveData(UserAccount.Memento memento) {
        history.push(memento);
    }

    public UserAccount.Memento getData() {
        return history.isEmpty() ? null : history.pop();
    }
}
