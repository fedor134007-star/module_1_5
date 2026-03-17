package org.example.memento.ex2;

public class Main {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("Vova", 100);
        History history = new History();

        // Сохраняем состояние
        history.saveData(user.saveAccount());

        // Меняем состояние
        user.addMoney(200);
        System.out.println(user); // UserAccount{username='Vova', allMoney=300}

        // Восстанавливаем из Memento
        UserAccount.Memento memento = history.getData();
        if (memento != null) {
            user.getAccount(memento);
        }
        System.out.println(user); // UserAccount{username='Vova', allMoney=100}
    }
}
