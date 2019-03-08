package pl.szymonkuhn.arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] string = new String[]{"las", "koń", "inwokacja", "szary"};
        int[] integer = new int[] {2, 4, 6, 8, 10, 12, 14};
        double[] doubles = new double[] {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};

        ArraysMethods arraysMethods = new ArraysMethods();
        arraysMethods.printString(string);
        System.out.println(arraysMethods.sumArray(integer));

        for (int i : (arraysMethods.arrayEvenNumbers(15))){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : (arraysMethods.doubleArray(integer))) {
            System.out.print(i + " ");
        }
        System.out.println();
        arraysMethods.showFirstMiddleEnd(doubles);

    }
}
