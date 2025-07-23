
import java.util.Scanner;

public class bc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        for(int i = 1; i < number; i++){
            if(i%2==0){
                //continue;
                break;
            }
            System.out.println(i);
            
        }
    }
}
