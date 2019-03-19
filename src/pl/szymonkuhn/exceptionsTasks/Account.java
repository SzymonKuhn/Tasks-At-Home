package pl.szymonkuhn.exceptionsTasks;

public class Account {
    private double accountBalance = 0.0;

    public Account(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double withdraw (double withdraw) throws NotEnoughAccountBalanceException {

        if (withdraw > accountBalance) {
            throw new NotEnoughAccountBalanceException ("Not enough cash!");
        }
        accountBalance -= withdraw;
        return accountBalance;
    }
}
