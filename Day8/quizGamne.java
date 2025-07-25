
import java.util.Scanner;

public class quizGamne {
    public static void main(String[] args) {
        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was Facebok launched?",
                              "Who is known as the father of conputer?",
                              "What was the first programming language?"};
        String[][] options ={{"1. Storing files", "2. Encryting data", "3. Directing internet traffic", "4. Managing password"},
                             {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                             {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                             {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                             {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};  
        int answers[] = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;
        boolean isAgain = true;

        Scanner scanner = new Scanner(System.in);
        do { 
            System.out.println("************************");
            System.out.println("Welcome to the JAVA QUIZ GAME!");
            System.out.println("************************");
            score = 0;

            for(int i = 0; i < questions.length; i++){
                System.out.println(questions[i]);
                for(String option : options[i]){
                    System.out.println(option);
                }
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();

                if(answers[i] == guess){
                    System.out.println("************************");
                    System.out.println("CORRECT!");
                    System.out.println("************************");
                    System.out.println();
                    score++;
                }
                else{
                    System.out.println("************************");
                    System.out.println("WORNG!");
                    System.out.println("************************");
                    System.out.println();
                }
            }
            System.out.println("GAME OVER!");
            System.out.println("Your final score is: " + score + " out of " + questions.length);
            System.out.println();
            System.out.print("Again game start? (Y/N): ");
            char again = scanner.next().charAt(0);
            if(again == 'Y'){
                isAgain = true;
            }
            else if(again == 'N'){
                isAgain = false;
            }
            else{
                System.out.print("Enter again: ");
                again = scanner.next().charAt(0);
            }
            System.out.println();
        } while (isAgain);


        // scanner.close();
    }
}
