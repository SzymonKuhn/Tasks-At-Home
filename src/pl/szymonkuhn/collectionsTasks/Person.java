package pl.szymonkuhn.collectionsTasks;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo (Person o) {
        return this.getFirstName().compareToIgnoreCase(o.getFirstName());
    }

    public int compareToByLastName (Person o) {
        return this.getLastName().compareToIgnoreCase(o.getLastName());
    }
}
