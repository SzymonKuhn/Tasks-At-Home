package pl.szymonkuhn.spojTasks;

import java.util.List;

public class SumaTest {
    public static void main(String[] args) {
        SumaMethods sumaMethods = new SumaMethods();
        List <Integer> listOfSumsInt = sumaMethods.listOfSums();
        System.out.println(listOfSumsInt);
    }
}
