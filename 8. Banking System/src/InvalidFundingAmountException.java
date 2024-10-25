
import java.text.DecimalFormat;

public class InvalidFundingAmountException extends BankException {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public InvalidFundingAmountException(double amount) {
        super("Số tiền không hợp lệ: $" + df.format(amount));
    }
}