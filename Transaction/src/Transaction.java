public class Transaction {
    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * parameterized constructor.
     * @param operation The type of operation
     * @param amount The amount of transaction value
     * @param balance The current balance
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    public String getOperation() {
        return operation;
    }

    public double getAmount() {
        return amount;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * main method to test.
     * @param args something
     */
    public static void main(String[] args) {
        Transaction t = new Transaction(DEPOSIT, 100, 250);
        System.out.println(t.getAmount());
        System.out.println(t.getBalance());
        t.setBalance(t.getBalance() - t.getAmount());
        System.out.println(t.getBalance());
    }
}
