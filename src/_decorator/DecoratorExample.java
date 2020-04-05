package _decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        ISandwich chickenSandwich = new ChickenSandwich(new BasicSandwich());
        String firstSandwich = chickenSandwich.make();
        System.out.println(firstSandwich);

        ISandwich chickenCheeseSandwich = new CheeseSandwich(new ChickenSandwich(new BasicSandwich()));
        String secondSandwich = chickenCheeseSandwich.make();
        System.out.println(secondSandwich);
    }
}
