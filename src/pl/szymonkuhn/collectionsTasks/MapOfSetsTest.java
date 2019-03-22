package pl.szymonkuhn.collectionsTasks;

import java.util.Map;
import java.util.Set;

public class MapOfSetsTest {
    public static void main(String[] args) {
        MapOfSetsStrings stringSetMap = new MapOfSetsStrings();
        stringSetMap.createMapOfSets("adam", "beata", "ala", "ewa", "barbara", "zdzisław", "albert", "aleksander", "Anna", "Zuzanna", "Mieszko", "Maria", "Bartosz", "emil", "Ewelina");

        System.out.println(stringSetMap.getStringSetMap());

        System.out.println("Dodaję imię Zbigniew:");
        stringSetMap.addString("Zbigniew");
        System.out.println(stringSetMap.getStringSetMap());
        System.out.println("Pobieram set dla litery Z");
        System.out.println(stringSetMap.getSet("Zdd"));
        System.out.println("Sprawdzam ilość słów dla A");
        System.out.println(stringSetMap.getNumberOfSet("A"));
        System.out.println("Dodaję imię Alcest");
        stringSetMap.addString("Alcest");
        System.out.println("Sprawdzam ilość słów dla A");
        System.out.println(stringSetMap.getNumberOfSet("A"));
    }
}
