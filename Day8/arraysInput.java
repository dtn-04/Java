
import java.util.Scanner;

public class arraysInput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What # of food do you want?: ");
        String[] foods;
        int size = scanner.nextInt();
        // scanner.nextLine();
        foods = new String[size];

        for(int i = 0; i<foods.length; i++){
            System.out.print("Enter the food: ");
            foods[i] = scanner.next();

        }
        for(String food : foods){
            System.out.println(food);
        }

    }
}