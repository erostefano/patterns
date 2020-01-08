package _observer;


public class Master implements IObserver {

    public Master(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Quick! Get a snack!");
    }
}
