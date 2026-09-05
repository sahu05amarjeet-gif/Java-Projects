import java.util.Scanner;

public class atmSimulator {
    public static int checkBalance(int balance) {
        System.out.println("Balance: " + balance);
        return 0;
    }

    public static int depositMoney(int balance) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit: ");
        int amount = input.nextInt();
        if (amount <= 0) {
            System.out.println("You cannot add negative/zero amount");
        }
        if (amount > 0) {
            System.out.println("Amount: " + amount);
            System.out.println("Your money has been deposited");
            return amount;
        }
        return 0;
    }

    public static int withdrawMoney(int balance) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw: ");
        int amount = input.nextInt();
        if (amount <= 0) {
            System.out.println("You cannot withdraw negative/zero balance");
        }
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
        if (amount < balance) {
            System.out.println("Amount: " + amount);
            System.out.println("Your money has been withdrawn successfully");
            return amount;
        }
        return 0;
    }

    public static void main(String[] args) {
        int user_pass = 1234;
        int balance = 0;
        boolean isRunning = true;
        while (isRunning) {
            System.err.println("=== ATM ===");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your pin: ");
            int password = input.nextInt();
            if (user_pass == password) {
                System.out.print("Choose: ");
                int userChoise = input.nextInt();
                if (userChoise == 4) {
                    isRunning = false;
                    System.out.println("Thanks for using our ATM");
                    break;
                }
                if (userChoise == 1) {
                    checkBalance(balance);
                } else if (userChoise == 2) {
                    balance += depositMoney(balance);
                } else if (userChoise == 3) {
                    balance -= withdrawMoney(balance);
                }
            }
            
        }
        System.out.println("Total Remaining Balance: " + balance);
    }

}
