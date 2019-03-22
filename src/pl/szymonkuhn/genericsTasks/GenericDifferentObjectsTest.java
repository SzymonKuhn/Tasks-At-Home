package pl.szymonkuhn.genericsTasks;
import pl.szymonkuhn.familyTasks.Person;
import pl.szymonkuhn.interfacesTasks.*;

public class GenericDifferentObjectsTest {
    public static void main(String[] args) {
        Person person = new Person();
        Fish fish = new Fish("rybka", "bulbul", 3, false);


        GenericDifferentObjects genericTwoObjectsTask = new GenericDifferentObjects(fish, person);
        System.out.println(genericTwoObjectsTask.getItemS());
        System.out.println(genericTwoObjectsTask.getItemT());
    }
}
