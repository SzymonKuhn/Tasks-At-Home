package pl.szymonkuhn.exceptionsTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException ime) {
            System.out.println("Błędny wpis");
        } finally {
            System.out.println("Instrukcja w klamrze finally");

        }


    }
}
