package _dao;

public class DaoExample {
    public static void main(String[] args) {
        Person steve = new Person("Steve");
        IPersonDAO personDAO = new XmlDAO();
        personDAO.savePerson(steve);
        System.out.println("Persons saved: " + personDAO.getPersons().size());
    }
}
