package _observer;

public class Dog extends Observable {
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
        super.notifyObservers();
    }
}
