package _dao;

import java.util.List;

public interface IPersonDAO {
    void savePerson(Person person);

    List<Person> getPersons();
}
