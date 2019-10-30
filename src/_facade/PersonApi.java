package _facade;

import java.util.ArrayList;
import java.util.List;

class PersonApi {
    private List<Person> persons = new ArrayList<>();

    PersonApi() {
        persons.add(new Person("Ann"));
        persons.add(new Person("Brittany"));
        persons.add(new Person("Caroline"));
        persons.add(new Person("Electra"));
        persons.add(new Person("Doris"));
    }

    List<Person> getPersons() {
        return persons;
    }
}
