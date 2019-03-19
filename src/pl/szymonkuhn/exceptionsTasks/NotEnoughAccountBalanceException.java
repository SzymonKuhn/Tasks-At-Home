package pl.szymonkuhn.exceptionsTasks;

public class NotEnoughAccountBalanceException extends RuntimeException {
    public NotEnoughAccountBalanceException(String message) {
        super(message);
    }
}
