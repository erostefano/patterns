package patternDelegation;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    void informPersonWithCallback(Informer informer) {
        informer.inform(name);
    }

    void informPerson() {
        Informer informer = new Informer();
        informer.inform(name);
    }
}
