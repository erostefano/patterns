package _dao;

import java.util.ArrayList;
import java.util.List;

public class XmlDAO implements IPersonDAO {

    List<Person> persons = new ArrayList<>();

    @Override
    public void savePerson(Person person) {
        persons.add(person);
        System.out.println("Save " + person.getName() + " as XML in defined dir!");
    }

    @Override
    public List<Person> getPersons() {
        return persons;
    }
}
