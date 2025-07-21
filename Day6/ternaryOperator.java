
import java.util.Scanner;


public class ternaryOperator  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income;
        System.out.print("income: ");
        income = scanner.nextDouble();

        double taxRate = (income>3000) ? 0.25 : 0.15;
        System.out.println(taxRate);

    }
}
