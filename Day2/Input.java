
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Width: ");
        width = scanner.nextDouble();

        System.out.print("Height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("Area is: " + area);

    }
}
