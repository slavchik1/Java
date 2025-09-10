import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime time;

    public Transaction(String type, double amount, LocalDateTime time) {
        this.type = type;
        this.amount = amount;
        this.time = time;
    }

    public void printTransaction() {
        System.out.printf("Type: %s\nAmount: %s\nTime: %s\n", type, amount, time);
    }
}
