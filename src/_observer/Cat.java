package _observer;


public class Cat implements IObserver {

    @Override
    public void update() {
        System.out.println("Damn! The dog is coming!");
    }
}
