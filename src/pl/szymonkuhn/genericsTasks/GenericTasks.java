package pl.szymonkuhn.genericsTasks;

import java.util.List;
import java.util.Set;

public class GenericTasks <T extends  Number> {
    public void showNumbersGreaterThenTen (List<T> numberList)  {
        for (Number number : numberList) {
            if (number.intValue() > 10){
                System.out.println(number);
            }
        }
    }

    public int getNumberOfOccurrenceInSet (Set<String> set, String string) {
        int numberOfOccurence = 0;
        for (String stringInSet : set) {
            if (stringInSet.contains(string) || string.contains(stringInSet)) {
                numberOfOccurence ++;
            }
        }
        return numberOfOccurence;
    }

}
