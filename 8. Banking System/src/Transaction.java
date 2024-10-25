
import java.text.DecimalFormat;

public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 0;
    public static final int TYPE_WITHDRAW_CHECKING = 1;
    public static final int TYPE_DEPOSIT_SAVINGS = 2;
    public static final int TYPE_WITHDRAW_SAVINGS = 3;
    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    /**
     * constructor with all parameters.
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    private String getTransactionType(int type) {
        if (type == TYPE_DEPOSIT_CHECKING) {
            return "Nạp tiền vãng lai";
        } else if (type == TYPE_DEPOSIT_SAVINGS) {
            return "Nạp tiền tiết kiệm";
        } else if (type == TYPE_WITHDRAW_CHECKING) {
            return "Rút tiền vãng lai";
        }
        return "Rút tiền tiết kiệm";
    }

    /**
     * method to get summary of this transaction.
     * @return String
     */
    public String getTransactionSummary() {
        StringBuilder s = new StringBuilder();
        s.append("- Kiểu giao dịch: " + this.getTransactionType(type) + ". ");
        s.append("Số dư ban đầu: $" + df.format(initialBalance) + ". Số tiền: $" 
        + df.format(amount) + ". ");
        s.append("Số dư cuối: $" + df.format(finalBalance) + ".\n");
        return s.toString();
    }
}