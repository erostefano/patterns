package _strategy;

public class Slack implements INotification {
    public void send() {
        System.out.println("Notificate by Slack");
    }
}
