package _observer;

public class ObserverExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        new Master(dog);
        new Cat(dog);
        dog.setActive(true);
    }
}
