package _observer;


public class Master implements IObserver {

    @Override
    public void update() {
        System.out.println("Quick! Get a snack!");
    }
}
