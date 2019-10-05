package _strategy;

public class StrategyExample {
    public static void main(String[] args) {
        /*
        At runtime depending on the condition a different implementation of INotification will be instantiated.
         */
        INotification notification;

        if (true) {
            notification = new Email();
        } else {
            notification = new Slack();
        }

        Person person = new Person(notification);
        person.inform();
    }
}
