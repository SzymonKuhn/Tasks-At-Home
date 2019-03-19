package pl.szymonkuhn.exceptionsTasks;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            int index = scanner.nextInt();
            String[] fruits = new String[]{"apple", "organe", "mango", "cheery"};
            System.out.println(fruits[index]);
        } catch (Exception e) {
            System.out.println("Błędny wpis, podaj liczbę od 0 do 4.");
        } finally {
            System.out.println("Instrukcja w klamrze finally");
        }



    }
}
