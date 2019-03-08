package pl.szymonkuhn.enumTasks;

//Stwórz klasę Money zawierającą dwa pola: currency i value. Nadpisz metodę do tworzenia wartości
//        tekstowej (toString()) tak żeby wyświetlała wartość z symbolem waluty, np. 40 EURO. Dodaj metodę
//        exchange(Currency currency), która zwróci nowy obiekt Money w nowej walucie dla aktualnej wartości.

public class Money {

String currency;
double value;

    public Money(String currency, double value) {
        this.currency = currency;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", value=" + value +
                '}';
    }
}
