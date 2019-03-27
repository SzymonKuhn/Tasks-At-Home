package pl.szymonkuhn.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTasks {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(randomNumber());
        }

        System.out.println("print all list with system out: " + integerList);
        System.out.println("print all list with stream:");
        integerList.stream().forEach(i -> System.out.print(i + " "));


        System.out.println("count: " + integerList.stream().count());

        System.out.println("sum with reduce: " + integerList.stream().reduce (0, (a, b) -> a + b ));
        System.out.println("sum with reduce Integer::sum: " + integerList.stream().reduce(Integer::sum));

        List<Integer> doubledSortedList = integerList.stream()
                .map(a -> a*2) //podwajamy
                .sorted() //sortujemy
                .filter(a -> a < 500) // filtrujemy
                .collect(Collectors.toList()); //oddajemy do kolekcji

        System.out.println("print doubled list: " + doubledSortedList);
        System.out.println("print with stream: ");
        doubledSortedList.stream().forEach(a -> System.out.print(a + " "));








    }

    static Integer randomNumber() {
        return (int)Math.round((Math.random()*100));
    }

}
