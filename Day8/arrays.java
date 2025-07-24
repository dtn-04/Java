
import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        String[] fruits = {"apple", "orange", "banana", "lemon"};
        Arrays.sort(fruits);
        Arrays.fill(fruits, "men");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
