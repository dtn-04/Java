
import java.util.Scanner;

public class arraysSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 4, 9, 2, 8, 3};
        String[] fruits = {"orange", "banana", "lemon"};
        String target;
        boolean isFound = false;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found");
        }
    }
}
