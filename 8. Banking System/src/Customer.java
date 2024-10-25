import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullname;
    private List<Account> accountList = new ArrayList<>();
    
    public Customer() {}

    public Customer(long idNumber, String fullname) {
        this.idNumber = idNumber;
        this.fullname = fullname;
    }

    public String getCustomerInfo() {
        return "Số CMND: " + idNumber + ". Họ tên: " + fullname + ".";
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}