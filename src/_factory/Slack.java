package _factory;

import _interface.IStore;

public class Slack implements IMessenger, IStore {

    private final String MESSENGER = "Slack";

    public void sendMessage() {
        System.out.println("Sent over " + MESSENGER);
    }

    public void store() {
        System.out.println("Stored in " + MESSENGER);
    }
}
