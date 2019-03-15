package pl.szymonkuhn.enumTasks;

public enum Operation {
    PLUS("+"),
    MINUS("-"),
    DIVIDE("/"),
    MULTIPLY("*");

    String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void calculate(double a, double b) {
        double result = 0.0;
        switch (this) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case DIVIDE:
                result = a / b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
        }
        System.out.println("Rezultat z działania: " + " " + a + " " + this.symbol + " " + b + " " + " to: " + result);
    }


//    public void calculateBySymbol (double a, double b) {
//        double result = 0.0;
//        switch (this.getSymbol()) {
//            case "+":
//                result = a + b;
//                break;
//            case "-":
//                result = a - b;
//                break;
//            case "/":
//                result = a / b;
//                break;
//            case "*":
//                result = a * b;
//                break;
//        }
//        System.out.println("Rezultat z działania: " + " " + a + " " + this.symbol + " " + b + " " + " to: " + result);
//    }


    public static Operation ofSymbol(String symbol) {
        for (Operation operation : values()) {
            if (symbol.equals(operation.getSymbol())){
                return operation;
            }
        }
        return null;
    }
}
