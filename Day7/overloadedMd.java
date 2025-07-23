public class overloadedMd {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.0, 2, 3));
        System.out.println(add(1, 2, 3));
    }

    static double add(double a, double b){
        return a + b;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }
}
