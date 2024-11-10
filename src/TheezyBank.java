import java.util.Scanner;

public class TheezyBank {

    public static void main(String[] args) {

        print("Enter Your name");
        String name = input();

        print("Enter Your Account Number");
        String accountNumber = input();

        print("Enter Your Account Type");
        String accountType = input();

        print("Enter Your Pin");
        String pin = input();

        Bank bank = new Bank();
        bank.createNewAccount(accountNumber, accountType, pin, name, 0.00);



    }


    public static void print(String message){
        System.out.println(message);
    }
    public static String input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
