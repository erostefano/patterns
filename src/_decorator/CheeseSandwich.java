package _decorator;

public class CheeseSandwich extends SandwichDecorator {
    public CheeseSandwich(ISandwich sandwich) {
        super(sandwich);
    }

    public String make() {
        return super.make() + " and creamy cheese";
    }
}
