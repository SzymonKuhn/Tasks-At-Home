package pl.szymonkuhn.exceptionsTasks;

public class ResultIsLessThenZeroException extends RuntimeException{
    public ResultIsLessThenZeroException(String message) {
        super(message);
    }
}
