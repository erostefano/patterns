package _factory;

public class FactoryExample {
    public static void main(String[] args) {
        IMessenger messenger = MessengerFactory.createMessenger(Math.random());
        messenger.sendMessage();
    }
}
