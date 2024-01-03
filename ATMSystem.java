import java.util.Scanner;

class BankAccount {
    private String accountNum;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNum, String accountHolder, double balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // withdrawal method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient funds.");
        }
    }

    //inquiry method
    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNum);
        System.out.println("Current Balance: " + balance);
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
   System.out.println("Enter the values a,b,c:");
         String a = obj.nextLine();
         String b = obj.nextLine();
         double c = obj.nextDouble();
        
        BankAccount myac = new BankAccount(a,b,c);

        
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

           
            System.out.print("Enter your choice (1-4): ");
            int choice = obj.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = obj.nextDouble();
                    myac.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = obj.nextDouble();
                    myac.withdraw(withdrawalAmount);
                    break;
                case 3:
                    myac.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
