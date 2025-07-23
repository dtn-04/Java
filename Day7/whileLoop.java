
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        do { 
            System.out.print("Enter number: ");
            number = scanner.nextInt();
        }while (number<4 || number >10);

        System.out.println("Number is: " + number);

        scanner.close();
    }
}
