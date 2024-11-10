import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List <Account> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }
    public void createNewAccount(String accountNumber, String accountType, String pin, String accountName, double balance){
        Account createAccount = new Account(accountName, balance, accountNumber, accountType, pin);
        accounts.add(createAccount);
        System.out.println("Account created successfully");
    }
}
