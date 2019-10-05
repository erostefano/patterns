package _strategy;

class Person {
    private INotification notification;

    Person(INotification notification) {
        this.notification = notification;
    }

    void inform() {
        notification.send();
    }
}
