package _adapter;

public class BoilerAdapter implements ICooking {
    public String cook() {
        BoilerLibrary boilerLibrary = new BoilerLibrary();
        boolean boiled = boilerLibrary.boil();
        return boiled ? "Lunch is ready" : "eat outside";
    }
}
