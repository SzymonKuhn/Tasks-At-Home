package pl.szymonkuhn.interfacesTasks;

public class AnimalClass implements Animal, Comparable<Animal> {
    String name;
    String speak;
    int age;

    public AnimalClass(String name, String speak, int age) {
        this.name = name;
        this.speak = speak;
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean isAlive() {
        return getAge() < MAX_AGE;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return speak;
    }

    @Override
    public int compareTo(Animal o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }
}
