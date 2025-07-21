
import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unil;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Covert to Celsius or Fahrenheit? (C or F): ");
        unil = scanner.next().toUpperCase();

        newTemp = (unil.equals("C")) ? (temp-32)*5/9 : (temp*9/5) + 32;

        System.out.printf("%.2f°%s", newTemp, unil);

        scanner.close();
    }
}
