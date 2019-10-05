package _inheritance;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void log() {
        System.out.println("Logged from Person.class");
    }
}
