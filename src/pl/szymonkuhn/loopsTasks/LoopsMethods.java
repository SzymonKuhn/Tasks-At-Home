package pl.szymonkuhn.loopsTasks;

import javax.swing.*;

public class LoopsMethods {
    public void showEvenNumbers(int n) {
        int x = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(x + ", ");
            x = x + 2;
        }
    }

    public int exponentiation(int a, int n) {
        int result = a;
        if (n <= 0) {
            result = 0;
        } else if (n == 1) {
            result = a;
        } else {
            for (int i = 1; i < n; i++) {
                result = result * a;
            }
        }
        return result;
    }

    public void alphabetFor() {
        // A = 65, Z = 90
        for (int i = 65; i <= 90; i = i + 2) {
            System.out.print((char) i + ", ");
        }
    }

    public void alphabetWhile() {
        // A = 65, Z = 90
        int a, z;
        a = 65;
        z = 90;
        while (a <= z) {
            System.out.print((char) a + ", ");
            a = a + 2;
        }
    }

    public boolean stringsEquals(String s1, String s2) {
        if (s1.length() == s2.length()){
            for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                return false;
                }
            }
            return true;
        }
        return false;
    }

    public int howManyContains (String phrase, String text) {
        int result = 0;
        while (phrase.contains(text)) {
            phrase = phrase.replaceFirst(text, "replacement");
            result = result + 1;
        }
        return result;
        }

    public void sumNumbersFromUser(float numbersSize) {
        float sum = 0;
        int x=0;
        for (int i = 1; i <= numbersSize; i++) {
            String numberInString = JOptionPane.showInputDialog("Podaj liczbę:");
            float numberFromUser = Float.valueOf(numberInString);
            System.out.println("Liczba nr " + i + " to: " + numberFromUser);
            sum += numberFromUser;
            x++;
        }
        System.out.println("sum = " + sum);
        System.out.println("średnia = " + sum/x);
    }

    public void showRectangle (int width, int height) {
        outer: for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
            continue outer;
        }
    }

    public void sumNumbersFloat (float max) {
        float sum = 0;
        int x = 0;
        while (sum <= max) {
            String numberInString = JOptionPane.showInputDialog("Podaj liczbę:");
            float numberFromUser = Float.valueOf(numberInString);
            sum += numberFromUser;
            x += 1;
            System.out.println("Liczba " + x + " to: " + numberFromUser);
        }
        System.out.println("Suma liczb to:" + sum);
        System.out.println("Dodano " + x + " liczb.");
        System.out.println("Średnia arytmetyczna liczb to: " + sum / x + ".");
    }

    public boolean isPalindrom (String s1) {
        String s2 = new String();
        for (int i =1; i <= s1.length(); i++) {
            int count = s1.length() - i;
            char x = s1.charAt(count);
            s2 = s2 + x;
        }
        return s1.equals(s2);
    }
}
