package pl.szymonkuhn.functional;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Tasks {

    public static void main(String[] args) {
        //#1
//        useLambdas();

        //#2
//        useOptional();

        //#3
        useStreams();
    }

    /**
     * 1. Utwórz i użyj lambdę która:
     * - utworzy obiekt klasy Double (Supplier)
     * - pobierze obiekt klasy String i wyświetli na konsolę (Consumer)
     * - sprawdzi czy podany string ma długość > 10 (Predicate)
     * - przekształci dwie liczby w String (zsumuje je i zwróci reprezentację tekstową) (BiFunction)
     */
    private static void useLambdas() {
        Supplier<Double> createDouble = () -> 20.0;
        Supplier<String> someText = () -> "someText it is";
        System.out.println(createDouble.get());
        System.out.println(someText.get() + createDouble.get());
        String text = "tekst";
        Consumer<String> printText = (s) -> System.out.println(s);
        printText.accept(text);
        Predicate<String> checkIfStringIsLongerThenTen = (t) -> t.length() > 10;
        System.out.println(checkIfStringIsLongerThenTen.test(text));
        System.out.println(checkIfStringIsLongerThenTen.test("this tekst is loneg then 10"));
        BiFunction<Integer, Integer, String> sumIntAndConvToString = (s, t) -> String.valueOf(s + t);
        System.out.println(sumIntAndConvToString.apply(110, 20));
    }

    /**
     * 2. Utwórz obiekt Optional, który:
     * - nie będzie zawierał żadnej wartości (Optional.empty)
     * - będzie pozwalał przyjmować wartość typu String, która może być `null` (Optional.ofNullable)
     * - rzuci wyjątkiem, w momencie podania wartości null typu Float (Optional.of)
     * - rzuci własny wyjątek, jeśli podano wartość `null` i próbowano pobrać wartość (Optional.orElseThrow)
     * - zwróci wartość domyślną dla typu String jeśli podano wartość `null` (Optional.orElse)
     */
    private static void useOptional() {
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> stringOptional = Optional.ofNullable("s");
        List<Float> list = Arrays.asList(10f, 12f, 40f);
        Optional<List<Float>> floatOptional = Optional.of(list);

    }


    /**
     * 3. Utwórz i użyj strumień danych (Stream):
     * - utwórz stream liczb typu Double z kolekcji typu Set - podaj ich sumę i średnią arytmetyczną
     * - utwórz stream liczb całkowitych od 10 do 40, usuń parzyste i podaj sumę pozostałych
     * - utwórz stream obiektów typu String, zamień wszystkie litery na małe, zostaw tylko te które zaczynają się na literę 'a' lub 'z'
     * i utwórz listę przetworzonych elementów
     * - utwórz stream obiektów Person i utwórz statystykę lat (suma, średnia, minimalny i maksymalny wiek) dla tego zbioru
     * - utwórz strumień który wypisze na ekran ścieżki wszystkich katalogów i podkatalogów znajdujących się w aktualnym katalogu (Files.list && Paths.get("."))
     */
    private static void useStreams() {
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(12.0D);
        doubleSet.add(63D);
        doubleSet.add(44D);
        doubleSet.add(29D);
        doubleSet.add(5D);
        doubleSet.add(90D);
        doubleSet.add(12.5D);
        doubleSet.add(55.5D);
        doubleSet.add(30D);
        doubleSet.add(42D);
        System.out.println();
        doubleSet.stream().forEach(s -> System.out.print(s + ", "));
        System.out.println();

        Double sum = doubleSet.stream().reduce(0.0, (a, b) -> a + b);
        System.out.println("sum: " + sum);
        Double avg = (sum / (doubleSet.stream().count()));
        System.out.println("averge: " + avg);

        List<Integer> integerList = new ArrayList<>();
        for (int i = 10; i <= 40; i++) {
            integerList.add(i);
        }

        System.out.println(integerList);

        int sumEvenNumbers = integerList.stream()
                .filter(s -> s % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sumEvenNumbers);


        List<String> stringList = Arrays.asList("Adam", "Beata", "Zuzanna", "Marek", "Barbara", "Dorota", "Anna", "Zdzisław", "Grzegorz", "Tadeusz", "Ewa", "Aneta", "Zbyszek");
        System.out.println(stringList);

        List<String> stringList1 = stringList.stream()
                .map(s -> s.toLowerCase())
                .filter(s -> s.startsWith("a") || s.startsWith("z"))
                .collect(Collectors.toList());

        System.out.println(stringList1);

        Person person1 = new Person(22, "Anna");
        Person person2 = new Person(35, "Weronika");
        Person person3 = new Person(44, "Jacek");
        Person person4 = new Person(33, "Tomek");
        Person person5 = new Person(21, "Grzegorz");
        Person person6 = new Person(33, "Wojtek");
        Person person7 = new Person(55, "Beata");

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5, person6, person7);
        System.out.println(personList);

        int sumAge = personList.stream()
                .map(a -> a.getAge())
                .reduce(0, (a, b) -> (a + b));
        System.out.println("sum age: " + sumAge);
        System.out.println(personList);

        Optional<Integer> minAge = personList.stream()
                .map(a -> a.getAge())
                .reduce((a, b) -> {
                            if (a > b) {
                                return b;
                            }
                            return a;
                        }
                );
        System.out.println("min age: " + minAge.get());

        Optional<Integer> maxAge = personList.stream()
                .map(a -> a.getAge())
                .reduce((a, b) -> {
                            if (a < b) {
                                return b;
                            }
                            return a;
                        }
                );
        System.out.println("max age: " + maxAge.get());

        int avargeAge = personList.stream()
                .map(a -> a.getAge())
                .reduce((a,b) -> a+b)
                .get()/personList.size();
        System.out.println("avarge age: " + avargeAge);

    }
}