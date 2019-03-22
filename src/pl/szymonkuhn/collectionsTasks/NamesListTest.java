package pl.szymonkuhn.collectionsTasks;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class NamesListTest {
    public static void main(String[] args) {
        Set<String> namesList = NamesList.getListOfNames();




        for (String string : namesList) {
            System.out.println(string);
        }

    }
}
