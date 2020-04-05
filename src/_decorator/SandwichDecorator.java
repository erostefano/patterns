package _decorator;

public abstract class SandwichDecorator implements ISandwich {
    private ISandwich sandwich;

    public SandwichDecorator(ISandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return sandwich.make();
    }
}
