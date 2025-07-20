
import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal*Math.pow((1+rate/timesCompounded), years*timesCompounded);
        //System.out.println("The amount after " + years + "is: $" + amount);
        System.out.printf("The amout after %d years is: $%.2f", years, amount);

        scanner.close();
    }
}
