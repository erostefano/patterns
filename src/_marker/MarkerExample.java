package _marker;

public class MarkerExample {

    public static void main(String[] args) {
        ICreature ICreature = createCreature();

        if (ICreature instanceof IPunchable) {
            System.out.println(ICreature.getName() + " is punchable!");
        } else {
            System.out.println(ICreature.getName() + " is not punchable!");
        }
    }

    private static ICreature createCreature() {
        return Math.random() < 0.5
                ? new Person("Steve")
                : new Animal("Dog");
    }
}
