import java.util.ArrayList;

public class BankAccount {
    private String accountHolder;
    private double balance = 0;
    private ArrayList<Transaction> transactionHistory = new ArrayList<>();

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public makingABankAccountDeposit(double amount) {
        if (amount > 0) {

        }
    }
}
