package pl.szymonkuhn.collectionsTasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski");
        Person person2 = new Person("Jaś", "Nowak");
        Person person3 = new Person("Kuba", "Wojewódzki");
        Person person4 = new Person("Janina", "Marszałkowski");
        Person person5 = new Person("Leonardo", "da Vinci");
        Person person6 = new Person("Barbara", "Barbara");
        Person person7 = new Person("Ryszard", "Ochódzki");
        Person person8 = new Person("Krzysztof", "Kowalewski");
        Person person9 = new Person("Adam", "Miauczyński");

        List<Person> personList = Arrays.asList(person1,person2, person3, person4, person5, person6, person7, person8, person9);


        System.out.println("Lista przed sortowaniem: ");

        for (Person person : personList) {
            System.out.print( person.getFirstName() + " ");
        }

        System.out.println();
        System.out.println("person1.compareTo(person2); " + person1.compareTo(person2));
        System.out.println("person7.compareTo(person2); " + person7.compareTo(person2));
        System.out.println();

        personList.sort(Person::compareTo);
        System.out.println("Lista po sortowaniu po imieniu: ");
        for (Person person : personList) {
            System.out.print( person.getFirstName() + " " + person.getLastName() + "; ");
        }


        personList.sort(Person::compareToByLastName);
        System.out.println();
        System.out.println("Lista po sortowaniu po nazwisku: ");
        for (Person person : personList) {
            System.out.print( person.getFirstName() + " " + person.getLastName() + "; ");
        }
    }
}
