
import java.util.Scanner;

public class subS {
    public static void main(String[] args) {
        // String email = "abc@gmail.com";
        // System.out.println(email.substring(0));
        // //System.out.println(email.substring(0, 3));
        // System.out.println(email.subSequence(0, email.indexOf("@")));
        // System.out.println(email.substring(4));

        Scanner scanner = new Scanner(System.in);
        String email;
        String name;
        String domain;

        System.out.print("Enter email: ");
        email = scanner.nextLine();
        if (email.contains("@")) {
            name = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Tên người dùng: " + name);
            System.out.println("Tên miền: " + domain);
        } else {
            System.out.println("Email không hợp lệ.");
        }

        scanner.close();
    }
}
