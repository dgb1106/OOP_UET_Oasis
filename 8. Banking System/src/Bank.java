
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Customer> customerList;

    public Bank() {
        customerList = new ArrayList<>();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    /**
     * method to read customer list from an input stream.
     * @param inputStream the input stream
     */
    public void readCustomerList(InputStream inputStream) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = reader.readLine();
            Customer customer = null;
            while (line != null) {
                String[] data = line.split(" ");
                if (data[0].matches("\\d{10}") && customer != null) {
                    long accountNumber = Long.parseLong(data[0]);
                    String accType = data[1];
                    double balance = Double.parseDouble(data[2]);
                    if (accType.equals("CHECKING")) {
                        customer.addAccount(new CheckingAccount(accountNumber, balance));
                    } else if (accType.equals("SAVINGS")) {
                        customer.addAccount(new SavingsAccount(accountNumber, balance));
                    }
                } else {
                    String fullName = line.substring(0, line.lastIndexOf(" "));
                    long idNumber = Long.parseLong(data[data.length - 1]);
                    customer = new Customer(idNumber, fullName);
                    customerList.add(customer);
                }
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * the method to get all customersInfo as a String.
     * @return String
     */
    public String customersInfo() {
        StringBuilder s = new StringBuilder();
        for (Customer c : customerList) {
            if (s.length() == 0) {
                s.append(c.getCustomerInfo());
            } else {
                s.append("\n");
                s.append(c.getCustomerInfo());
            }
        }
        return s.toString();
    }

    /**
     * method to get all customers info by name order.
     * @return String
     */
    public String getCustomersInfoByNameOrder() {
        customerList.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                return c1.getFullname().compareTo(c2.getFullname());
            }
        });
        return customersInfo();
    }

    /**
     * method to get all customers info by id order.
     * @return String
     */
    public String getCustomersInfoByIdOrder() {
        customerList.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                return Long.compare(c1.getIdNumber(), c2.getIdNumber());
            }
        });
        return customersInfo();
    }
}