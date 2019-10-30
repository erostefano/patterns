package _facade;

import java.util.List;
import java.util.stream.Collectors;

class PersonFacade {

    private PersonApi personApi = new PersonApi();

    Person getPersonNameStartWithLetterA() {
        return personApi.getPersons()
                .stream()
                .filter(person -> person.getName().startsWith("A"))
                .findFirst()
                .orElse(null);
    }

    List<String> getPersonsSorted() {
        return personApi.getPersons()
                .stream()
                .map(Person::getName)
                .sorted()
                .collect(Collectors.toList());
    }
}
