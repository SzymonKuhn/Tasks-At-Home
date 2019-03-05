package pl.szymonkuhn.loopsTasks;

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
}
