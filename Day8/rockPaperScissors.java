
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String choices[] = {"rock", "paper", "scissor"};
        String guessChoice;
        String computerChoice;
        boolean isAgain = true;

        do { 
            System.out.print("Enter your move (rock, paper, scissor): ");
            guessChoice = scanner.nextLine().toLowerCase();
            if(!guessChoice.equals("rock") && !guessChoice.equals("paper") && !guessChoice.equals("scissor")){
                System.out.println("Invalid choice");
                continue;
            }
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);
            if(guessChoice.equals(computerChoice)){
                System.out.println("It is a tie");
            }
            else if((guessChoice == "rock" && computerChoice == "paper") 
                     || (guessChoice == "paper" && computerChoice == "scissor")
                     || (guessChoice == "scissor" && computerChoice == "rock")) {
                System.out.println("You lose!");
            }
            else{
                System.out.println("You win!");
            }

            System.out.print("Again game (yes/no): ");
            String again = scanner.nextLine().toLowerCase();
            if(again.equals("yes")){
                isAgain = true;
            }
            else if(again.equals("no")){
                isAgain = false;
            }
            else{
                System.out.println("Invalid value");
                System.out.print("Again game (yes/no): ");
                again = scanner.nextLine().toLowerCase();
            }

        } while (isAgain);

        System.out.println("Thanks for playing");
        scanner.close();
    }
}
