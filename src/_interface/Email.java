package _interface;

public class Email implements IMessenger, IStore {

    private final String MESSENGER = "E-Mail";

    public void sendMessage() {
        System.out.println("Sent over " + MESSENGER);
    }

    public void store() {
        System.out.println("Stored in " + MESSENGER);
    }
}
