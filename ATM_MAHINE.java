
import java.util.*;

public class ATM_MAHINE {
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;

        String name;
        Scanner input = new Scanner(System.in);

        // we have to take input from the user

        System.out.println("Enter Your pin number");
        int password = input.nextInt();

        if (password == pin) {
            System.out.println("Enter Your Name");
            name = input.next();
            System.out.println("Welcome " + name);

            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take receipt");
                System.out.println("Press 5 to exit");
                int opt = input.nextInt();

                switch (opt) {
                    case 1:
                        System.out.println("Your current Balance is: " + balance);
                        break;
                    case 2:
                        System.out.println("Enter the Amount you want to deposit: ");
                        int depositAmount = input.nextInt();
                        balance += depositAmount;
                        System.out.println("Deposited Successfully!");
                        break;
                    case 3:
                        System.out.println("Enter the Amount You Want To Withdraw:");
                        int withdrawalAmount = input.nextInt();
                        if (withdrawalAmount > balance) {
                            System.out.println("Insufficient Funds! Please Deposit More.");
                        } else {
                            balance -= withdrawalAmount;
                            System.out.println("Withdrawal Successful!");
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to All-in-One mini ATM");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Thanks for Coming");
                        break;
                    case 5:
                        System.out.println("Thank you. Exiting...");
                        input.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid PIN number");
        }
    }
}
