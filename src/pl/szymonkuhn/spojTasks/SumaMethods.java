package pl.szymonkuhn.spojTasks;

import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SumaMethods  {
    List<Integer> listOfInt = new ArrayList<>();

    public List<Integer> getListOfInt() throws RuntimeException {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Podaj liczbę lub wpisz q aby wyjść.");
            String i = scanner.nextLine();
            if (i.equalsIgnoreCase("q")) {
                return listOfInt;
            }
            try {
                listOfInt.add(Integer.parseInt(i));
            } catch (RuntimeException e) {
                System.out.println("Błędny wpis");
            }
        }
    }

    public List<Integer> listOfSums() {
        List<Integer> listOfInt = getListOfInt();
        List<Integer> listOfSums = new ArrayList<>();
        Iterator<Integer> iterator = listOfInt.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            i += iterator.next();
            listOfSums.add(i);
        }
        return listOfSums;
    }
}