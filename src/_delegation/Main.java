package _delegation;

public class Main {
    public static void main(String[] args) {
        /*
        Delegation from inside the class
         */
        Person alice = new Person("Alice");
        alice.informPerson();

        /*
        Delegation given from outside the class
         */
        Person bob = new Person("Bob");
        bob.informPersonWithCallback(new Informer());
    }
}
