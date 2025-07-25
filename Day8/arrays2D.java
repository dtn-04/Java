
import java.util.Arrays;

public class arrays2D {
    public static void main(String[] args) {
        char[][] telephones = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'#', '0', '*'}};
        
        for(char[] numbers : telephones){
            System.out.println(Arrays.toString(numbers));
        }

        for(char[] numbers : telephones){
            for(char number : numbers){
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}
