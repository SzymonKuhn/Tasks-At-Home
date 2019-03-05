package pl.szymonkuhn.familyTasks;

public class Person {
    private String name, surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return new StringBuilder("Imię: ").append(name).append(", nazwisko: ").append(surname).append(", lat: ").append(age).append(".").toString();


//        "Person{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", age=" + age +
//                '}';
    }
}
