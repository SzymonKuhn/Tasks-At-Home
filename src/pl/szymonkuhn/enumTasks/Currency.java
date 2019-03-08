package pl.szymonkuhn.enumTasks;

public enum Currency {
    POLSKI_ZLOTY("PLN", 1.0),
    DOLAR("USD", 3.8),
    JEN("JEN", 2.2),
    EURO("EUR", 4.3),
    FUNT("PBR", 5.1);

    private String symbol;
    private double course;

    Currency(String symbol, double course) {
        this.symbol = symbol;
        this.course = course;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getCourse() {
        return course;
    }



    public double toPLN(double cash) {
        switch (this) {
            case POLSKI_ZLOTY:
                return cash * POLSKI_ZLOTY.course;
            case DOLAR:
                return cash * DOLAR.course;
            case JEN:
                return cash * JEN.course;
            case EURO:
                return cash * EURO.course;
            case FUNT:
                return cash * FUNT.course;
        }
        return 0;



    }

    public double fromPLN(double cash) {
        switch (this) {
            case POLSKI_ZLOTY:
                return cash / POLSKI_ZLOTY.course;
            case DOLAR:
                return cash / DOLAR.course;
            case JEN:
                return cash / JEN.course;
            case EURO:
                return cash / EURO.course;
            case FUNT:
                return cash / FUNT.course;
        }
        return 0;
    }

//    switch (this.symbol) {
//            case "PLN":
//                return cash / POLSKI_ZLOTY.course;
//            case "USD" :
//                return cash / DOLAR.course;
//            case "JEN":
//                return cash / JEN.course;
//            case "EUR":
//                return cash / EURO.course;
//            case "PBR":
//                return cash / FUNT.course;
//        }
//        return 0;

//    Zadbaj by można było na bazie reprezentacji tekstowej ("PLN", "+" itp) znaleźć odpowiednią wartość enum
//    Currency i Operation.

}
