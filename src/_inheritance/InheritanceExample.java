package _inheritance;

public class InheritanceExample {
    public static void main(String[] args) {

        /*
        Upcasting
        - the methods from student are not visible anymore
         */
        Person p = new Student();
        p.log();

        /*
        Downcasting
        - We make the methods from Student visible
         */
        Person p2 = new Student();
        ((Student) p2).logDifferent();
    }
}
