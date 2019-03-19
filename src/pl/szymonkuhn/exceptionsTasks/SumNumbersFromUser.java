package pl.szymonkuhn.exceptionsTasks;

import java.util.Scanner;

public class SumNumbersFromUser {

    public double[] getNumbersFromUser () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg liczb oddzielonych spacjami: ");
        String input = scanner.nextLine();
        String[] stringInArray = input.split(" ");
        double[] doubleArray = new double[stringInArray.length];

        try {
            for (int i = 0; i < stringInArray.length; i++) {
                doubleArray[i] = Double.parseDouble(stringInArray[i]);
            }
        } catch (Exception e){
                System.out.println("Błędny wpis");
            }
        return doubleArray;
    }

    public void printDoubles (double[] arrayOfDoubles) {
        for (double arrayOfDouble : arrayOfDoubles) {
            System.out.print(arrayOfDouble + ", ");
        }
    }

    public double sumArrayOfDouble (double[] input)throws ResultIsLessThenZeroException {
        double result = 0;
        for (double v : input) {
            result += v;
        }
        if (result < 0){
            throw new ResultIsLessThenZeroException ("Liczba jest mniejsza niż zero");
        }
        return result;
    }
}
