package b;

public class BankAccountMain {
    public static void main(String[] args) {
        BackAccount backAccount = new BackAccount();

        backAccount.deposit(10000);

        System.out.println(backAccount.getBalance());
    }
}
