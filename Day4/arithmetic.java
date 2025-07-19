
import java.util.Scanner;



public class arithmetic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        int z = 10;

        System.out.print("X: ");
        x = scanner.nextInt();
        System.out.print("Y: ");
        y = scanner.nextInt();

        z += 1;
        System.out.println("z += 1: " + z);
        z++;
        System.out.println("z++: " + z);

        z -= 1;
        System.out.println("z -= 1: " + z);
        z--;
        System.out.println("z--: " + z);

        x /= 1;
        System.out.println("x /= 1: " + x);

        x *= 1;
        System.out.println("x *= 1: " + x);

        x %= y;
        System.out.println("x%=y: " + x);

        scanner.close();
    }
}
