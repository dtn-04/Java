
import java.util.Scanner;

public class bankking {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //bankking program for beginers

        //declare variables
        //display menu
        //get and process user choice
        //showBalance();
        //deposit()
        //withdraw()
        //exit message

        boolean isRunning = true;
        double balance = 0;
        int choice;

        while (isRunning) { 
            System.out.println("~~~~~~~~~~~");
            System.out.println("BANKKING PROGRAM");
            System.out.println("~~~~~~~~~~~");
            System.out.println("1. Show blance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("~~~~~~~~~~~");
            System.out.print("Enter choice (1-4): ");
            choice = scanner.nextInt();
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> {
                    balance += deposit();
                    System.out.println("~~~~~~~~~~~");
                    System.out.printf("Balance: %.2f\n", balance);
                }
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("****************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("****************");
        scanner.close();
        
    }

    static void showBalance(double balance){
        System.out.println("~~~~~~~~~~~");
        System.out.printf("%.2f\n", balance);
    }

    static double deposit(){
        double amount;
        System.out.print("Enter amount: ");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdraw: ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount<0){
            System.out.println("Amount can't be negative.");
            return 0;
        }else{
            return amount;
        }
        
    }
}
