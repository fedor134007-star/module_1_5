package org.example.facade.notification;

public class NotificationImpl implements Notification {
    @Override
    public void sendMessage(boolean isActive) {
        switch (isActive) {
            case true:
                IO.println("Service Mode ON");
            case false:
                IO.println("Service Mode OFF");
        }
    }
}
