package pl.szymonkuhn.genericsTasks;
import pl.szymonkuhn.interfacesTasks.*;

public class ZooGenericsTest {
    public static void main(String[] args) {
        Fish fish1 = new Fish("ryba1", "bulbul", 5, false);
        Fish fish2 = new Fish("ryba2", "bulbul", 11, false);
        Fish fish3 = new Fish("ryba3", "bulbul", 12, false);
        Fish fish4 = new Fish("ryba4", "bulbul", 3, false);
        Bird bird1 = new Bird("ptak1", "ćwir", 17, true);
        Bird bird2 = new Bird("ptak2", "ćwir", 6, true);
        Bird bird3 = new Bird("ptak3", "ćwir", 2, true);

        ZooGenerics zooGenerics = new ZooGenerics();
        zooGenerics.addAnimal(fish1);
        zooGenerics.addAnimal(fish2);
        zooGenerics.addAnimal(fish3);
        zooGenerics.addAnimal(fish4);
        zooGenerics.addAnimal(bird1);
        zooGenerics.addAnimal(bird2);
        zooGenerics.addAnimal(bird3);

//        System.out.println("Count birds: " + zooGenerics.countBirds());
//        System.out.println("Count fishes: " + zooGenerics.countFishes());
        System.out.println("Count animals: " + zooGenerics.countAnimals());
        System.out.println("Count older then 10: " + zooGenerics.countAnimalsOlderThen(10));
        zooGenerics.countByType();

    }
}
