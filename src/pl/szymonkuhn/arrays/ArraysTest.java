package pl.szymonkuhn.arrays;


import pl.szymonkuhn.familyTasks.*;

public class ArraysTest {


    public static void main(String[] args) {
//        String[] string = new String[]{"las", "koń", "inwokacja", "szary"};
//        int[] integer = new int[]{2, 4, 6, 8, 10, 12, 14};
//        double[] doubles = new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
//
        ArraysMethods arraysMethods = new ArraysMethods();
//        arraysMethods.printString(string);
//        System.out.println(arraysMethods.sumArray(integer));
//
//        for (int i : (arraysMethods.arrayEvenNumbers(15))) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i : (arraysMethods.doubleArray(integer))) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        arraysMethods.showFirstMiddleEnd(doubles);

        arraysMethods.printStringVarargs("jan", "małgorzata", "i inni");

        System.out.println(arraysMethods.sumArrayVarargs(12,13,15,22,55,66));

        for (int i : arraysMethods.doubleArrayVarargs(12, 55, 21, 13)){
            System.out.println(i + ", ");
        }

        arraysMethods.showFirstMiddleEndVarargs(10.1, 12, 15, 22.2, 10, 20);

        Person[] personArray = new Person[3];
        Person jan = new Person("Jan", "Kowalski", 33);
        Person ewa = new Person("Ewa", "Kowalska", 32);
        Person maciej = new Person("Maciej", "Nowak", 12);
        Person robert = new Person("Robert", "Iksiński", 222);

        personArray[0] = jan;
        personArray[1] = ewa;
        personArray[2] = maciej;

        for (Person person :  personArray) {
            System.out.println(person.toString());
        }



        for (Person person : ArraysMethods.reverseElements(personArray)) {
            System.out.println(person.toString());
        }

        for (Person person : ArraysMethods.reverseElementsVarargs(jan, ewa, maciej, robert, ewa)) {
            System.out.println(person.toString());
        }

        int[][] array = new int[2][3];
        array[0][0] = 13;
        array[0][1] = 12;
        array[0][2] = 10;
        array[1][0] = 3;
        array[1][1] = 4;
        array[1][2] = 5;
        System.out.println(arraysMethods.sumArray2D(array));


    }
}
