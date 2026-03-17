package org.example.facade.facade;

import org.example.facade.api.Api;
import org.example.facade.api.ApiImpl;
import org.example.facade.ble.Ble;
import org.example.facade.ble.BleImpl;
import org.example.facade.database.Database;
import org.example.facade.database.DatabaseImpl;
import org.example.facade.notification.Notification;
import org.example.facade.notification.NotificationImpl;

public class ServiceModeImpl implements ServiceMode {
    Notification notification = new NotificationImpl();
    Database database = new DatabaseImpl();
    Ble ble = new BleImpl();
    Api api = new ApiImpl();


    @Override
    public void enableServiceMode() {
        database.create();
        ble.turnOnServiceMode();
        api.sendAction();
        notification.sendMessage(true);
    }

    @Override
    public void disableServiceMode() {
        database.delete();
        ble.turnOffServiceMode();
        api.sendAction();
        notification.sendMessage(false);

    }
}
