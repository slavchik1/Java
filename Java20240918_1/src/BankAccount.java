public class BankAccount {
    int id;
    String name;
    float balance;

    void deposit(int value) {
        float balance = this.balance;
        balance += value;
    }

    void credit(int value) {
        float balance = this.balance;
        balance -= value;
    }
}
