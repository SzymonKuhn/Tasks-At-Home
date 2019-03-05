package pl.szymonkuhn.stringTasks;

public class StringMethods {

    public void simonSays(String text) {
        System.out.println("Simon says: '" + text + "'.");
    }

    public String trimAndLowerCase(String text) {
        text = text.trim();
        text = text.toLowerCase();
        return text;
    }

    public boolean compareText(String s1, String s2) {
        return s1.equals(s2);
    }

    public boolean compareFirst(String s1, String s2) {
        return s1.charAt(0) == s2.charAt(0);
    }

    public boolean compareLastThree(String s1, String s2) {
        s1 = s1.trim();
        s2 = s2.trim();
        int s1length = s1.length();
        int s2length = s2.length();
        s1 = s1.substring((s1length - 4), (s1length - 1));
        s2 = s2.substring((s2length - 4), (s2length - 1));
        return compareText(s1, s2);
    }

    public String replaceNie(String s1) {
        return s1 = s1.replace("nie", "tak");
    }

    public boolean containsNieThreeTimes(String s1) {
        if (s1.contains("nie")) {
            s1 = s1.replaceFirst("nie", "tak");
            if (s1.contains("nie")) {
                s1 = s1.replaceFirst("nie", "tak");
                if (s1.contains("nie")) {
                    return true;
                }
            }
        }
        return false;
    }

}


