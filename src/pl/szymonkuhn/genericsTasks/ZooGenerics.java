package pl.szymonkuhn.genericsTasks;
import pl.szymonkuhn.interfacesTasks.*;

import java.util.HashSet;
import java.util.Set;

public class ZooGenerics <T extends AnimalClass> {
    private T itemT;
    private Set<T> set = new HashSet<>();


    public void addAnimal (T animalToAdd) {
        set.add(animalToAdd);
    }

    public Set<T> getSet() {
        return set;
    }

    public T getItemT() {
        return itemT;
    }

    public int countBirds () {
        int result = 0;
        for (T type : set) {
            if (type.getClass() == Bird.class) {
                result++;
            }
        }
        return result;
    }

    public int countFishes () {
        int result = 0;
        for (T type : set) {
            if (type.getClass() == Fish.class) {
                result++;
            }
        }
        return result;
    }

    public int countAnimals () {
        return set.size();
    }

    public int countAnimalsOlderThen (int age) {
        int result = 0;
        for (T type : set) {
            if (type.getAge() > age) {
                result++;
            }
        }
        return result;
    }
}
