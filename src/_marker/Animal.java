package _marker;

public class Animal implements ICreature {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
