package Day10.toString;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Mustang", 2025, "green");
        Car car2 = new Car("Mec", "c200", 2000, "white");

        System.out.println(car1);
        System.out.println(car2.toString());
    }
}
