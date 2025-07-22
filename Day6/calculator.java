
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operater;
        double result = 0;
        boolean validOperater = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter an operater (+, -, *, /, ^): ");
        operater = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operater){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by zero!");
                    validOperater = false;
                }else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operater.");
                validOperater = false;
            }
        }

        if(validOperater){
            System.out.println(result);
        }


        scanner.close();
    }
}
