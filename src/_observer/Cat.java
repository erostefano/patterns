package _observer;


public class Cat implements IObserver {

    public Cat(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Damn! The dog is coming!");
    }
}
