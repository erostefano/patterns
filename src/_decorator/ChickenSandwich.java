package _decorator;

public class ChickenSandwich extends SandwichDecorator {
    public ChickenSandwich(ISandwich sandwich) {
        super(sandwich);
    }

    public String make() {
        return super.make() + " and tasty chicken";
    }
}
