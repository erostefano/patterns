package _marker;

class Person implements ICreature, IPunchable {
    private String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
