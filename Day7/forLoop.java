
import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many second coutdown from?: ");
        int second = scanner.nextInt();
        for(int i = second; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy new year!");
        
        scanner.close();
    }
}
