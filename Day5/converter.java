import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        //weight converter program
        
        //khai bao bien
        //welcom message
        //nhac nho nhap lieu
        //lua chon chuyen doi lbs sang kg
        //lua chon 2 chuyen doi kg sang lbs
        //k co lua chon

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");
        
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            //System.out.println("The new weight in kgs is: " + newWeight);
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            //System.out.println("The new weight in kgs is: " + newWeight);
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        else{
            System.out.println("That was not a valid choice");
        }

        scanner.close();
    }
}
