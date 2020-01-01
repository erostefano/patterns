package _generic_dao;

public class Course {
    private String name;

    protected Course(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

}
