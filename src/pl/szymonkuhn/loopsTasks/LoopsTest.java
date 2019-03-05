package pl.szymonkuhn.loopsTasks;

public class LoopsTest {
    public static void main(String[] args) {
        LoopsMethods loopsMethods = new LoopsMethods();

        loopsMethods.showEvenNumbers(12);
        System.out.println();
        System.out.println(loopsMethods.exponentiation(1, 0));
        System.out.println(loopsMethods.exponentiation(2, 3));
        System.out.println(loopsMethods.exponentiation(3, 2));
        System.out.println(loopsMethods.exponentiation(5, 1));
        System.out.println(loopsMethods.exponentiation(6, -1));
        System.out.println();
        loopsMethods.alphabetFor();
        System.out.println();
        loopsMethods.alphabetWhile();
        System.out.println();

    }
}
