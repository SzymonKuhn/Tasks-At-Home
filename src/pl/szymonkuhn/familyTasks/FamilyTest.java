package pl.szymonkuhn.familyTasks;

public class FamilyTest {
    public static void main(String[] args) {
        Person jan = new Person("Jan", "Kowalski", 33);
        Person ewa = new Person("Ewa", "Kowalska", 34);
        Person jas = new Person("Jaś", "Kowalski", 12);
        Family kowalscy = new Family(jan, ewa, jas, "Kowalscy");

        System.out.println(jas.toString());
        System.out.println(jan.toString());
        System.out.println(ewa.toString());
        System.out.println(kowalscy.toString());
        System.out.println(kowalscy.sumAge());
        System.out.println(kowalscy.ageMid());
    }

}
