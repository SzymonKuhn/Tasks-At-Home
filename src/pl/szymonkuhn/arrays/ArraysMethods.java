package pl.szymonkuhn.arrays;

public class ArraysMethods {

    public void printString (String[] string) {
//        for (int i = 0; i < string.length; i++) {
//            System.out.print(string[i] + " ");
//        }
        int i = 0;
        while ( i < string.length) {
            System.out.println(string[i]);
            i += 1;
        }
    }

    public int sumArray (int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public int[] arrayEvenNumbers (int count) {
        int number = 2;
        int[] result = new int[count];
        for (int i=0; i < count; i++) {
            result[i] = number;
            number += 2;
        }
        return result;
    }

    public int[] doubleArray (int[] source) {
        int[] result = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = source[i] * 2;
        }
        return result;
    }

    public void showFirstMiddleEnd (double[] source) {
        int x = source.length;
        System.out.println(source[0]);
        if (x % 2 == 0) {
            System.out.println(source[x / 2]);
        }else{
            System.out.println(source[(x-1)/2]);
            System.out.println(source[(x+1)/2]);
        }
        System.out.println(source[x-1]);
    }
}
