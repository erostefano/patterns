package _generic_dao;

public class Person {
    private String name;

    protected Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}
