package _generic_dao;

public class GenericDaoExample {
    public static void main(String[] args) {
        ImplDao<Person> personImplDao = new ImplDao<>();
        personImplDao.save(new Person("Steve"));

        ImplDao<Course> courseImplDao = new ImplDao<>();
        courseImplDao.save(new Course("Software Engineering"));
    }
}
