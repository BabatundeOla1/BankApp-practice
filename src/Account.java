public class Account {
    private String accountName;
    private double balance;
    private String accountNumber;
    private String accountType;
    private String pin;

    public Account(String accountName, double balance, String accountNumber, String accountType, String pin) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.pin = pin;
    }

    //getter and setter
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
