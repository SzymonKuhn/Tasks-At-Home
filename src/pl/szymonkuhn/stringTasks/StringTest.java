package pl.szymonkuhn.stringTasks;

public class StringTest {
    public static void main(String[] args) {
        StringMethods stringMethods = new StringMethods();

        stringMethods.simonSays("Ala ma kota");
        System.out.println(stringMethods.trimAndLowerCase("   Ala Ma KOTA   "));

        System.out.println(stringMethods.compareText("Ala ma kota", "Ala ma kota"));
        System.out.println(stringMethods.compareText("Ala ma kotka!", "Ala ma niekota"));
        System.out.println(stringMethods.compareFirst("Ala ma kota", "Beata ma kota"));
        System.out.println(stringMethods.compareFirst("Ala ma kota", "Adam ma kota"));
        System.out.println();
        System.out.println(stringMethods.compareLastThree("alamakota", "ala ma kota"));
        System.out.println();
        System.out.println(stringMethods.containsNieThreeTimes("ala nie   nie dd  nie kota nie nie nie "));
        System.out.println(stringMethods.containsNieThreeTimes("ala    nie dd   kota"));
    }
}
