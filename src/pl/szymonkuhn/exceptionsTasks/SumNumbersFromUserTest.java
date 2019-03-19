package pl.szymonkuhn.exceptionsTasks;

public class SumNumbersFromUserTest {
    public static void main(String[] args) {
        SumNumbersFromUser sumNumbersFromUser = new SumNumbersFromUser();

        double[] numbers = sumNumbersFromUser.getNumbersFromUser();
        sumNumbersFromUser.printDoubles(numbers);
        System.out.println("łącznie: " + sumNumbersFromUser.sumArrayOfDouble(numbers));
    }
}
