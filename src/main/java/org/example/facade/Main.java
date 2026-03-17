package org.example.facade;

import org.example.facade.facade.ServiceMode;
import org.example.facade.facade.ServiceModeImpl;

public class Main {

    static void main() {
        ServiceMode serviceMode = new ServiceModeImpl();
        serviceMode.enableServiceMode();
        serviceMode.disableServiceMode();
    }
}
