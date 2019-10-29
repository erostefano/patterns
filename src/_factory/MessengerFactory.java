package _factory;

class MessengerFactory {
    static IMessenger createMessenger(double randomNumber) {
        return randomNumber < 0.5 ? new Email() : new Slack();
    }
}
