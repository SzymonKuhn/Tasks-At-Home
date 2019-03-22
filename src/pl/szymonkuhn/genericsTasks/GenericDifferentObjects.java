package pl.szymonkuhn.genericsTasks;

import pl.szymonkuhn.familyTasks.Person;
import pl.szymonkuhn.interfacesTasks.AnimalClass;
import pl.szymonkuhn.interfacesTasks.*;


public class GenericDifferentObjects<T extends AnimalClass,S extends Person> {
    private T itemT;
    private S itemS;


    public GenericDifferentObjects(T itemT, S itemS) {
        this.itemT = itemT;
        this.itemS = itemS;
    }

    public T getItemT() {
        return itemT;
    }

    public S getItemS() {
        return itemS;
    }
}
