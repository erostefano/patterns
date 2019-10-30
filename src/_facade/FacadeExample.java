package _facade;

public class FacadeExample {
    public static void main(String[] args) {
        PersonFacade personFacade = new PersonFacade();

        System.out.println(personFacade.getPersonNameStartWithLetterA());
        System.out.println(personFacade.getPersonsSorted());
    }
}
