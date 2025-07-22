import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        //Temp va sunny

        // double temp;
        // boolean isSunny;

        // System.out.print("Enter temperature (°C): ");
        // temp = scanner.nextDouble();

        // System.out.print("Is today sunny? (true/false): ");
        // isSunny = scanner.nextBoolean();

        // if (temp >= 0 && temp <= 30) {
        //     System.out.println("The weather is GOOD 👍");

        //     if (isSunny) {
        //         System.out.println("It is SUNNY outside ☀️");
        //     } else {
        //         System.out.println("It is CLOUDY outside ☁️");
        //     }

        // } else {
        //     System.out.println("The weather is BAD 👎");
        // }



        //Kiem tra ten: 4-12 ky tu, k co khoang trang hoac gach chan
        String username;
        System.out.print("Enter name: ");
        username = scanner.nextLine();

        if((username.length()<4 || username.length()>12) || (username.contains(" ") || username.contains("_"))){
            System.out.println("Enter again.");
        }
        else{
            System.out.println("Welcome, " + username);
        }
        scanner.close();
    }
}
