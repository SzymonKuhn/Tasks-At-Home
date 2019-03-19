package pl.szymonkuhn.exceptionsTasks;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1200.15);
        System.out.println(account.getAccountBalance());
        account.withdraw(150.33);
        System.out.println(account.getAccountBalance());
        account.withdraw(150.33);
        System.out.println(account.getAccountBalance());
        account.withdraw(150.33);
        System.out.println(account.getAccountBalance());
        account.withdraw(150.33);
        System.out.println(account.getAccountBalance());
        account.withdraw(800);
        System.out.println(account.getAccountBalance());
    }
}
