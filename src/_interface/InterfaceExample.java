package _interface;

public class InterfaceExample {
    public static void main(String[] args) {
        /*
        Only the implementation of sendMessage() is passed.
         */
        IMessenger emailMessenger = new Email();
        emailMessenger.sendMessage();

        IMessenger slackMessenger = new Slack();
        slackMessenger.sendMessage();

        /*
        Only the implementation of store() is passed.
         */
        IStore emailStore = new Email();
        emailStore.store();

        IStore slackStore = new Slack();
        slackStore.store();
    }
}
