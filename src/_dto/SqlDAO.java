package _dto;

import java.util.ArrayList;
import java.util.List;

public class SqlDAO implements IPersonDAO {

    List<Person> persons = new ArrayList<>();

    @Override
    public void savePerson(Person person) {
        persons.add(person);
        System.out.println("Save " + person.getName() + " in Database!");
    }

    @Override
    public List<Person> getPersons() {
        return persons;
    }
}
