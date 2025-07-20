
import java.util.Scanner;



public class mathCls {
    public static void main(String[] args) {
        // System.out.println(Math.PI);
        // System.out.println(Math.E);

        // double result;
        
        // //luy thua 2^5
        // result = Math.pow(2, 5);

        // //can bac 2
        // result = Math.sqrt(9);

        // //tri tuyet doi
        // result = Math.abs(-5);

        // //lam tron so gan nhat
        // result = Math.round(3.14);

        // //lam tron len 4
        // result = Math.ceil(3.14);

        // //lam tron xuong 3
        // result = Math.floor(3.99); 

        // //so lon hon
        // result = Math.max(10, 20);

        // //so nho hon
        // result = Math.min(10,20);

        // System.out.println(result);

        ////c = sqrt(a²+b²) alt numlock 0178
        // Scanner scanner = new Scanner(System.in);
        // double a, b, c;

        // System.out.print("a: ");
        // a = scanner.nextDouble();

        // System.out.print("b: ");
        // b = scanner.nextDouble();

        // //c = a*a+b*b;
        // //c = Math.sqrt(a*a+b*b);
        // c = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));

        // System.out.println(c);

        // scanner.close();

        //tinh chu vi, s, v
        Scanner scanner = new Scanner(System.in);
        double radius;

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();

        // System.out.println("circumference: " + 2*Math.PI*radius + "cm");
        // System.out.println("area: " + 2*Math.PI*Math.pow(radius, 2) + "cm²");
        // System.out.println("volume: " + (3/4.0)*Math.PI*Math.pow(radius, 3) + "cm³");
        System.out.printf("circumference: %.1fcm\n", 2*Math.PI*radius);
        System.out.printf("area: %.1fcm²\n", 2*Math.PI*Math.pow(radius, 2));
        System.out.printf("volume: %.1fcm³", (3/4.0)*Math.PI*Math.pow(radius, 3));
        scanner.close();
    }
}
