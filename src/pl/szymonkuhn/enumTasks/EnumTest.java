package pl.szymonkuhn.enumTasks;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Currency.DOLAR.toPLN(750));
        System.out.println(Currency.JEN.toPLN(130));
        System.out.println(Currency.EURO.fromPLN(250));
        System.out.println(Currency.EURO.toPLN(58));

        System.out.println(Currency.DOLAR.getSymbol());
        Operation.DIVIDE.calculate(20, 12.3);
        Operation.MULTIPLY.calculate(11.7, 3.2);

        System.out.println(Operation.ofSymbol("+"));



    }
}
