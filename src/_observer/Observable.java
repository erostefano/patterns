package _observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<IObserver> observers = new ArrayList<>();

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
