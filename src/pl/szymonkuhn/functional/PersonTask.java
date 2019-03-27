package pl.szymonkuhn.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PersonTask {
    public static void main(String[] args) {
        Person person1 = new Person(22, "Anna");
        Person person2 = new Person(35, "Weronika");
        Person person3 = new Person(44, "Jacek");
        Person person4 = new Person(33, "Tomek");
        Person person5 = new Person(21, "Grzegorz");
        Person person6 = new Person(33, "Wojtek");
        Person person7 = new Person(55, "Beata");
        Person person8 = new Person(32, "Tomek");


        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5, person6, person7,person8);
        System.out.println(personList);
        System.out.println("Write name to find: ");
        String name = inputName();
        List<Person> personList1 = findPerson(name, personList);
        if (personList1.isEmpty()) {
            System.out.println("No such person");
        } else {
            System.out.println(personList1);
        }

        Optional<String> namesList = personList.stream()
                .map(s -> s.getName())
                .sorted()
                .map(s-> s.toUpperCase())
                .limit(5)
                .reduce((a, b) -> a + ", " + b);
        System.out.println(namesList.get());
    } //main

    static List<Person> findPerson (String name, List<Person> personList) {
        return personList.stream()
                .filter (s-> s.getName().equals(name))
                .collect(Collectors.toList());
    }

    static String inputName () {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

} // class
