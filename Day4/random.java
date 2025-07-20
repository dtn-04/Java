
import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();

        int number1;
        double number2;
        boolean isHeads;

        number1 = random.nextInt();
        System.out.println(number1);

        number1 = random.nextInt(1, 7);
        System.out.println(number1);

        number2 = random.nextDouble();
        System.out.println(number2);

        isHeads = random.nextBoolean();
        if(isHeads){
            System.out.println("Head");
        }
        else{
            System.out.println("Tail");
        }
    }
}
