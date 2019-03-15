package pl.szymonkuhn.spojTasks;

public class Polowa {

    public String halfOfString (String input) {
        String result = "";
        for (int i = 0; i < (input.length()/2); i++) {
            result = result + input.charAt(i) ;
        }
        return result;
    }
}
