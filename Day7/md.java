public class md {
    public static void main(String[] args) {
        String name = "Ngan";
        int age = 22;
        happyBriday(name, age);

        double number = 3;
        System.out.println(square(number));
        System.out.println(cube(number));

        String firstName = "Do";
        String lastName = "Ngan";
        System.out.println(fullName(firstName, lastName));

        if(ageCheck(age)){
            System.out.println("ault");
        }
        else{
            System.out.println("baby");
        }
    }

    static void happyBriday(String name, int age){
        System.out.println("Happy briday to you!");
        System.out.printf("Happy briday to %s\n", name);
        System.out.printf("%d years old\n", age);
        System.out.println("Happy briday to you");
    }

    static double square(double number){
        return number*number;
    }

    static double cube(double number){
        return number*number*number;
    }

    static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
