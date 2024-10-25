
import java.text.DecimalFormat;

public class InsufficientFundsException extends BankException {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public InsufficientFundsException(double amount) {
        super("Số dư tài khoản không đủ $" + df.format(amount) + " để thực hiện giao dịch");
    }
}