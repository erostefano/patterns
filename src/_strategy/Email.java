package _strategy;

public class Email implements INotification {
    public void send() {
        System.out.println("Notificate by E-Mail");
    }
}
