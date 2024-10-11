import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * deposit method to add money to account.
     * @param amount The amount of transaction value
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        balance += amount;
    }

    /**
     * withdraw method to add money to account.
     * @param amount The amount of transaction value
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        balance -= amount;
    }

    /**
     * method to add transaction to the transaction list.
     * @param amount The amount of transaction value
     * @param operation The type of operation
     */
    public void addTransaction(double amount, String operation) {
        if (!operation.equals(Transaction.DEPOSIT) && !operation.equals(Transaction.WITHDRAW)) {
            System.out.println("Yeu cau khong hop le!");
            return;
        }
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else {
            withdraw(amount);
        }
        transitionList.add(new Transaction(operation, amount, balance));
    }

    /**
     * print out to the console all the transactions have been made.
     */
    public void printTransaction() {
        DecimalFormat df = new DecimalFormat("#.00");
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction current = transitionList.get(i);
            double currentAmount = Math.round(current.getAmount() * 100.0) / 100.0;
            double currentBalance = Math.round(current.getBalance() * 100.0) / 100.0;
            String currentOperation;
            if (current.getOperation().equals(Transaction.DEPOSIT)) {
                currentOperation = "Nap tien ";
            } else {
                currentOperation = "Rut tien ";
            }
            System.out.println("Giao dich " + (i + 1) + ": " + currentOperation + "$" 
            + df.format(currentAmount) + ". So du luc nay: $" + df.format(currentBalance) + ".");
        }
    }

    /**
     * main method to test.
     * @param args something
     */
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(2000.255, "deposit");
        acc.addTransaction(1000, "withdraw");
        acc.printTransaction();
    }
}