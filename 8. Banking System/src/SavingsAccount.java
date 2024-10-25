public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 1000.0 || balance - amount < 5000.0) {
            return;
        }
        double initialBalance = balance;
        try {
            doWithdrawing(amount);
            this.addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS, 
            amount, initialBalance, balance));                           
        } catch (InvalidFundingAmountException | InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void deposit(double amount) {
        double initialBalance = balance;
        try {
            doDepositing(amount);
            this.addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS, 
            amount, initialBalance, balance));
        } catch (InvalidFundingAmountException e) {
            System.err.println(e.getMessage());
        }
    }
}