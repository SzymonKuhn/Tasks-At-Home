package pl.szymonkuhn.familyTasks;

public class Family {
    private Person dad = new Person();
    private Person mom = new Person();
    private Person child = new Person();
    private String family;


    public Family(Person dad, Person mom, Person child, String family) {
        this.dad = dad;
        this.mom = mom;
        this.child = child;
        this.family = family;
    }

    public int sumAge() {
        int age = dad.getAge() + mom.getAge() + child.getAge();
        return age;
    }

    public double ageMid() {
        double ageMid = this.sumAge() / 3;
        return ageMid;
    }

    public String getFamily() {
        return family;
    }

    @Override
    public String toString() {
        return new StringBuilder("Rodzina ").append(family).append(" to: ").append(dad).append(mom).append(child).toString();

        //        return "Family{" +
//                "dad=" + dad +
//                ", mom=" + mom +
//                ", child=" + child +
//                '}';
    }
}
