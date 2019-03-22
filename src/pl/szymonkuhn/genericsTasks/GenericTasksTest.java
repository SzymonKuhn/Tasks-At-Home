package pl.szymonkuhn.genericsTasks;

import java.util.*;

public class GenericTasksTest {
    public static void main(String[] args) {
        GenericTasks genericTasks = new GenericTasks();
        List<Integer> integerList = Arrays.asList(12, 5, 10, 20, 1, 9, 0, -10, 500);
        List<Double> doubleList = Arrays.asList(12.0, 5.1, 10.4, 20.3, 1.1, 9.9, 0.0, -10.1, 500.2);
        genericTasks.showNumbersGreaterThenTen(integerList);
        genericTasks.showNumbersGreaterThenTen(doubleList);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("adam");
        stringSet.add("ada");
        stringSet.add("beata");
        stringSet.add("beada");
        stringSet.add("gaweł");
        stringSet.add("anna");
        stringSet.add("biada");
        stringSet.add("bieda");
        System.out.println(stringSet);
        System.out.println("ilość 'ada' w zbiorze: " + genericTasks.getNumberOfOccurrenceInSet(stringSet, "ada"));
    }
}
