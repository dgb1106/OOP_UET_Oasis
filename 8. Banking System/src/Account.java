import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();
    
    public Account() {
        this.accountNumber = 0;
        this.balance = 0;
    }

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * method to deposit an amount of money.
     * @param amount the amount to deposit
     * @throws InvalidFundingAmountException invalid exception
     */
    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        balance += amount;
    }

    /**
     * method to withdraw an amount of money.
     * @param amount the amount to withdraw
     * @throws InsufficientFundsException not enough money
     * @throws InvalidFundingAmountException invalid amount
     */
    public void doWithdrawing(double amount) 
    throws InsufficientFundsException, InvalidFundingAmountException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    /**
     * method to compare accounts.
     * @param o the other account
     * @return boolean
     */
    public boolean equals(Object o) {
        if (o instanceof Account) {
            Account a = (Account) o;
            if (this.accountNumber == a.getAccountNumber()) {
                return true;
            }
        }
        return false;
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * method to get all transaction history.
     * @return the string of results
     */
    public String getTransactionHistory() {
        StringBuilder s = new StringBuilder();
        s.append("Lịch sử giao dịch của tài khoản " + accountNumber + ":\n");
        for (Transaction t : transactionList) {
            s.append(t.getTransactionSummary());
        }
        return s.toString();
    }
}