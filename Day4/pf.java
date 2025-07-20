public class pf {
    public static void main(String[] args) {
        String name = "Ngan";
        char firstLetter = 'N';
        int age = 21;
        double height = 158.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("You name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.2f\n inches tall\n", height);
        System.out.printf("Employ: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        //, = tach hang tram, hang nghin
        //+ = bieu thi dau dang truoc so
        //( = boc so am
        //space = cach 1 khoang trang voi so duong

        double price1 = 10000.05;
        double price2 = -10304.231;
        System.out.printf("%+.2f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%,.2f\n", price1);
        System.out.printf("%(.2f\n", price1);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        //so la khoang cach trang truoc hoac sau
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
