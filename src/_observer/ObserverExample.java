package _observer;

public class ObserverExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.addObserver(new Master());
        dog.addObserver(new Cat());
        dog.setActive(true);
    }
}
