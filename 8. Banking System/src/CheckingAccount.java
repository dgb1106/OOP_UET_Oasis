public class CheckingAccount extends Account {
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        double initialBalance = this.balance;
        try {
            doWithdrawing(amount);
            this.addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_CHECKING, 
            amount, initialBalance, balance));
        } catch (InvalidFundingAmountException | InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void deposit(double amount) {
        double initialBalance = this.balance;
        try {
            doDepositing(amount);
            this.addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_CHECKING, 
            amount, initialBalance, balance));
        } catch (InvalidFundingAmountException e) {
            System.err.println(e.getMessage());
        }
    }
}