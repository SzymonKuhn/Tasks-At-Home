package pl.szymonkuhn.collectionsTasks;

import java.util.*;

public class NamesList {

    public static Set<String> getListOfNames() {
        Scanner scanner = new Scanner(System.in);
        Set<String> namesList = new TreeSet<>();
        while (true) {
            System.out.println("Podaj imię lub wpisz 'q' aby wyjść: ");
            String name = scanner.nextLine();
            if ("q".equalsIgnoreCase(name)) {
                break;
            }
            namesList.add(name);
        }
        return namesList;
    }



    }
